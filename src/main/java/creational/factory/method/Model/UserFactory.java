package creational.factory.method.Model;

/**
 * Merupakan class factory yang mengatur dibuatnya instance / object User sesuai statusnya
 *
 * @author Faza Zulfika P P
 * @since 9 January 2018
 * @version 1.0.0
 */
public class UserFactory {

    /**
     * Method yang digunakan untuk membuat instance / object User sesuai statusnya
     *
     * @param nik merupakan nik dari User
     * @param name merupakan name dari User
     * @param email merupakan email dari User
     * @param userStatus merupakan status dari User
     * @return merupakan instance / object dari User
     */
    public User getUser(Integer nik, String name, String email, UserStatus userStatus) {
        if (userStatus == null) // Jika userstatus tidak ada
            return null; // Mengembalikan null

        /*
            Pengecekan status user
         */
        switch (userStatus) {
            case Lecturer: // Jika statusnya Lecturer
                return new Lecturer(nik, name, email); // Membuat instance / object User dari class Lecturer
            case Student: // Jika statusnya Student
                return new Student(nik, name, email); // Membuat instance / object User dari class Student
            default: // Jika userstatus tidak ditemukan
                return null; // Mengembalikan null
        }
    }
}
