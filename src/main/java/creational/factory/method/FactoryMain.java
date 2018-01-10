package creational.factory.method;

import creational.factory.method.model.User;
import creational.factory.method.factory.UserFactory;
import creational.factory.method.model.UserStatus;

/**
 * Class untuk melakukan testing design pattern Factory
 *
 * @author Faza Zulfika P P
 * @version 1.0.0
 * @since 9 January 2018
 */
public class FactoryMain {

    /**
     * Method main dari aplikasi
     *
     * @param args merupakan input dari user
     */
    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory(); // Membuat instance / object factory

        Integer nik1 = 2110151023; // Inisialisasi nik user 1
        String name1 = "Faza Zulfika P P"; // Inisialisasi name user 1
        String email1 = "fazazulfikapp@it.student.pens.ac.id"; // Inisialisasi email user 1

        User user1 = userFactory.getUser(nik1, name1, email1, UserStatus.Student); // Meminta instance / object user1 kepada factory
        user1.introduction(); // Menampilkan informasi user 1

        Integer nik2 = 2110151001; // Inisialisasi nik user 2
        String name2 = "Lecturer"; // Inisialisasi name user 2
        String email2 = "lecturer@pens.ac.id"; // Inisialisasi email user 2

        User user2 = userFactory.getUser(nik2, name2, email2, UserStatus.Lecturer); // Meminta instance / object user2 kepada factory
        user2.introduction(); // Menampilkan informasi user 2
    }
}
