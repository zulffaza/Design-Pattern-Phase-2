package creational.prototype;

import creational.prototype.cache.UserCache;
import creational.prototype.model.Lecturer;
import creational.prototype.model.Student;
import creational.prototype.model.User;

/**
 * Class untuk melakukan testing design pattern prototype
 *
 * @author Faza Zulfika P P
 * @version 1.0.0
 * @since 10 January 2018
 */
public class PrototypeTest {

    /**
     * Method main dari aplikasi
     *
     * @param args merupakan input dari user
     */
    public static void main(String[] args) {
        Integer nik1 = 2110151023; // Inisialisasi nik user 1
        String name1 = "Faza Zulfika P P"; // Inisialisasi name user 1
        String email1 = "fazazulfikapp@it.student.pens.ac.id"; // Inisialisasi email user 1

        User user1 = new Student(nik1, name1, email1); // Membuat instance / object user1
        user1.introduction(); // Menampilkan informasi user 1

        Integer nik2 = 2110151001; // Inisialisasi nik user 2
        String name2 = "Lecturer"; // Inisialisasi name user 2
        String email2 = "lecturer@pens.ac.id"; // Inisialisasi email user 2

        User user2 = new Lecturer(nik2, name2, email2); // Membuat instance / object user2
        user2.introduction(); // Menampilkan informasi user 2

        /*
            Memasukkan kedua instance / object User ke dalam cache
         */
        UserCache.saveUser(nik1.toString(), user1);
        UserCache.saveUser(nik2.toString(), user2);

        User user1Cloned = UserCache.getUser(nik1.toString()); // Meminta clone instance / object dengan id nik1 ke cache
        user1Cloned.introduction(); // Menampilkan informasi user1Cloned

        User user2Cloned = UserCache.getUser(nik2.toString()); // Meminta clone instance / object dengan id nik2 ke cache
        user2Cloned.introduction(); // Menampilkan informasi user2Cloned

        UserCache.clearCache(); // Mengosongkan cache
    }
}
