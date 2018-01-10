package creational.factory.abstractclass.factory;

import creational.factory.abstractclass.model.*;

/**
 * Merupakan class factory yang mengatur dibuatnya instance / object User sesuai statusnya
 *
 * @author Faza Zulfika P P
 * @since 10 January 2018
 * @version 2.0.0
 */
public class UserFactory implements Factory {

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

    /**
     * Method yang digunakan untuk membuat instance / object Animal sesuai tipenya
     * Pada class ini method ini tidak digunakan, karena class ini adalah factory untuk instance / object User
     *
     * @param age merupakan umur dari Animal
     * @param name merupakan name dari Animal
     * @param animalType merupakan tipe dari Animal
     * @return merupakan instance / object dari Animal
     */
    @Override
    public Animal getAnimal(Integer age, String name, AnimalType animalType) {
        return null;
    }
}
