package creational.factory.abstractclass.factory;

import creational.factory.abstractclass.model.Animal;
import creational.factory.abstractclass.model.AnimalType;
import creational.factory.abstractclass.model.User;
import creational.factory.abstractclass.model.UserStatus;

/**
 * Merupakan class yang mengatur dibuatnya instance / object yang dikelola oleh factory
 *
 * @author Faza Zulfika P P
 * @since 10 January 2018
 * @version 1.0.0
 */
public interface Factory {

    /**
     * Method yang digunakan untuk membuat instance / object User sesuai statusnya
     *
     * @param nik merupakan nik dari User
     * @param name merupakan name dari User
     * @param email merupakan email dari User
     * @param userStatus merupakan status dari User
     * @return merupakan instance / object dari User
     */
    public User getUser(Integer nik, String name, String email, UserStatus userStatus);

    /**
     * Method yang digunakan untuk membuat instance / object Animal sesuai tipenya
     *
     * @param age merupakan umur dari Animal
     * @param name merupakan name dari Animal
     * @param animalType merupakan tipe dari Animal
     * @return merupakan instance / object dari Animal
     */
    public Animal getAnimal(Integer age, String name, AnimalType animalType);
}
