package creational.objectpool;

import creational.objectpool.model.User;
import creational.objectpool.pool.UserPool;

/**
 * Class untuk melakukan testing design pattern object pool
 *
 * @author Faza Zulfika P P
 * @version 1.0.0
 * @since 13 January 2018
 */
public class ObjectPoolTest {

    /**
     * Method main dari aplikasi
     *
     * @param args merupakan input dari user
     */
    public static void main(String[] args) {
        int unsuccessfullRentedSum = 5; // Menset jumlah yang tidak berhasil meminjam dari pool

        UserPool userPool = UserPool.getInstance(); // Mengambil instance / object pool yang berukuran default (10)

//        UserPool.createPoolInstance(100); // Membuat instance / object pool dengan ukuran 100
//        UserPool userPool = UserPool.getInstance(); // Mengambil instance / object pool yang berukuran 100

        /*
            Uji coba peminjaman dan pengembalian instance / object dari dan ke pool
         */
        for (int i = 0; i < (userPool.getPoolSize() + unsuccessfullRentedSum); i++) {

            /*
                Membuat thread yang akan meminjam instance / object user dari pool
                Lalu menunggu selama 5 detik
                Dan mengembalikan instance / object tersebut
             */
            new Thread(new Runnable() {

                @Override
                public void run() {
                    User user = userPool.rentUserObject(); // Meminjam instance / object user dari pool

                    try {
                        Thread.sleep(5000); // Menunggu selama 5 detik
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted while sleeping...");
                        System.out.println("Caused by : " + e.getMessage());
                    } finally {
                        user.introduction(); // Menampilkan informasi dari user
                    }

                    userPool.restoreUserObject(user); // Mengembalikan instance / object user ke dalam pool
                }
            }).start(); // Menjalankan thread
        }
    }
}
