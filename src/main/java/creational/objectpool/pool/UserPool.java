package creational.objectpool.pool;

import creational.objectpool.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Merupakan class yang mengimplementasikan object pool pattern
 * Class ini akan menjadi pool dari object User
 *
 * @author Faza Zulfika P P
 * @version 1.0.0
 * @since 13 January 2017
 */
public class UserPool {

    /**
     * Instance / object dari UserPool untuk menyimpan instance / object yang dibuat
     */
    private static UserPool INSTANCE = null;

    /**
     * Instance / object List User yang berperan sebagai User pool
     * Digunakan untuk menyimpan instance / object dari User yang telah dibuat
     */
    private List<User> users;

    /**
     * Instance / object List Boolean yang berperan sebagai flag dari User pool
     * Digunakan untuk menyimpan tanda apakah instance / object dari User pada index tersebut disewa ataukah tidak
     */
    private List<Boolean> availableUserFlags;

    /**
     * Field size dari pool, bertipe int
     */
    private int poolSize;

    /**
     * Merupakan default constructor yang menerima 1 parameter, yaitu size dari pool
     *
     * @param poolSize merupakan size dari pool yang akan dibuat
     */
    private UserPool(int poolSize) {
        this.poolSize = poolSize; // Menyimpan size dari pool

        System.out.println("Creating " + poolSize + " users pool...");

        users = new ArrayList<>(poolSize); // Menginisialisasi List yang akan berperan sebagai pool
        availableUserFlags = new ArrayList<>(poolSize); // Menginisialisasi List yang akan berperan sebagai flag pool

        /*
            Menginisialisasi instance / object User dan menyimpannya didalam pool sesuai size pool
         */
        for (int i = 0; i < poolSize; i++) {
            int num = i + 1; // Inisialisasi angka penanda
            int defaultNrp = 2110151000; // Inisialisasi nrp awal
            String defaultName = "User "; // Inisialisasi angka awal

            User user = new User((defaultNrp + num), (defaultName + num)); // Membuat instance / object user
            users.add(user); // Menyimpan instance / object user ke dalam pool
            availableUserFlags.add(true); // Menset flag untuk instance / object user yang telah dibuat
        }

        System.out.println("Finish creating users pool!!!");
        System.out.println("");
    }

    /**
     * Merupakan method untuk membuat pool dengan size yang diinginkan
     *
     * @param poolSize merupakan size dari pool yang ingin dibuat
     */
    public static void createPoolInstance(int poolSize) {
        INSTANCE = new UserPool(poolSize); // Membuat instance / object pool berdasarkan size yang diinginkan
    }

    /**
     * Merupakan method untuk mendapatkan instance / object pool
     *
     * @return merupakan instance / object pool
     */
    public static UserPool getInstance() {
        if (INSTANCE == null) // Mengecek apakah belum ada instance / object yang dibuat
            createPoolInstance(10); // Jika belum ada, maka dibuat instance / objectnya, dengan size pool 10

        return INSTANCE; // Mengembalikan instance / objectnya
    }

    /**
     * Merupakan method untuk mendapatkan size dari pool
     *
     * @return merupakan size dari pool
     */
    public int getPoolSize() {
        return poolSize;
    }

    /**
     * Merupakan method untuk meminjam instance / object User dari dalam pool
     *
     * @return merupakan instance / object pool yang dapat dipinjam
     */
    public User rentUserObject() {
        User user = null; // Menginisialisasi instance / object User yang akan dikembalikan dengan null

        System.out.println("Renting user object from pool...");

        /*
            Mencari instance / object yang dapat dipinjam (flag instance / object false)
         */
        for (int i = 0; i < this.poolSize; i++) {
            if (availableUserFlags.get(i)) { // Mengecek ketersediaan instance / object
                availableUserFlags.set(i, false); // Jika instance / object tersedia, maka flag diubah menjadi false
                user = users.get(i); // Mengambil instance / object user dari dalam pool, dan menyimpannya ke dalam instance / object user yang telah dibuat

                break; // Hentikan pencarian
            }
        }

        /*
            Mengecek apakah berhasil mendapatkan pinjaman instance / object user dari dalam pool
         */
        if (user == null) { // Jika tidak berhasil meminjam
            System.out.println("Waiting for restored user object...");

            try {
                Thread.sleep(2500); // Menunggu pinjaman selanjutnya selama 2.5 detik
            } catch (InterruptedException e) {
                System.out.println("Error while waiting for restored user object...");
                System.out.println("Error : " + e.getMessage());
            } finally {
                System.out.println("");
            }

            return rentUserObject(); // Maka akan meminjam terus sampai instance / object didapatkan
        } else { // Jika berhasil meminjam
            System.out.println("Renting user object success!!!");
            System.out.println("");

            return user; // Maka mengembalikan instance / object user yang berhasil dipinjam
        }
    }

    /**
     * Merupakan method yang digunakan untuk mengembalikan instance / object user yang telah dipinjam ke dalam pool
     *
     * @param user merupakan instance / object user yang dipinjam
     */
    public void restoreUserObject(User user) {
        boolean isRestored = false; // Merupakan flag apakah berhasil mengembalikan ataukah tidak

        System.out.println("Restoring user object to pool...");

        /*
            Mencari apakah instance / object yang ingin dikembalikan benar berasal dari pool
         */
        for (int i = 0; i < poolSize; i++) {
            User userFromPool = users.get(i); // Mengambil instance / object dari dalam pool

            /*
                Mengecek apakah instance / object yang ingin dikembalikan sama dengan instance / object yang diambil dari pool
             */
            if (userFromPool.equals(user)) { // Jika sama
                isRestored = true; // Berhasil mengembalikan, flag diubah menjadi true
                availableUserFlags.set(i, true); // Flag pool diubah menjadi true

                break; // Hentikan pencarian
            }
        }

        if (isRestored) // Jika berhasil dikembalikan
            System.out.println("Restoring user object success!!!");
        else // Jika tidak
            System.out.println("User object is not a rented user object!!!");

        System.out.println("");
    }
}
