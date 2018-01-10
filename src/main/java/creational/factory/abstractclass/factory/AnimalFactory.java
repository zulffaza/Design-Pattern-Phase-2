package creational.factory.abstractclass.factory;

import creational.factory.abstractclass.model.*;

/**
 * Merupakan class factory yang mengatur dibuatnya instance / object Animal sesuai tipenya
 *
 * @author Faza Zulfika P P
 * @version 1.0.0
 * @since 10 January 2018
 */
public class AnimalFactory implements Factory {

    /**
     * Method yang digunakan untuk membuat instance / object User sesuai statusnya
     * Pada class ini method ini tidak digunakan, karena class ini adalah factory untuk instance / object Animal
     *
     * @param nik        merupakan nik dari User
     * @param name       merupakan name dari User
     * @param email      merupakan email dari User
     * @param userStatus merupakan status dari User
     * @return merupakan instance / object dari User
     */
    @Override
    public User getUser(Integer nik, String name, String email, UserStatus userStatus) {
        return null;
    }

    /**
     * Method yang digunakan untuk membuat instance / object Animal sesuai tipenya
     *
     * @param age        merupakan umur dari Animal
     * @param name       merupakan name dari Animal
     * @param animalType merupakan tipe dari Animal
     * @return merupakan instance / object dari Animal
     */
    @Override
    public Animal getAnimal(Integer age, String name, AnimalType animalType) {
        if (animalType == null) // Jika animaltype tidak ada
            return null; // Mengembalikan null

        /*
            Pengecekan tipe animal
         */
        switch (animalType) {
            case Dog: // Jika tipenya Dog
                return new Dog(age, name); // Membuat instance / object Animal dari class Dog
            case Cat: // Jika statusnya Cat
                return new Cat(age, name); // Membuat instance / object Animal dari class Cat
            default: // Jika animaltype tidak ditemukan
                return null; // Mengembalikan null
        }
    }
}
