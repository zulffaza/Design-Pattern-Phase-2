package creational.factory.abstractclass;

import creational.factory.abstractclass.factory.*;
import creational.factory.abstractclass.model.Animal;
import creational.factory.abstractclass.model.AnimalType;
import creational.factory.abstractclass.model.User;
import creational.factory.abstractclass.model.UserStatus;

/**
 * Class untuk melakukan testing design pattern Factory
 *
 * @author Faza Zulfika P P
 * @version 1.0.0
 * @since 10 January 2018
 */
public class AbstractFactoryTest {

    /**
     * Method main dari aplikasi
     *
     * @param args merupakan input dari user
     */
    public static void main(String[] args) {
        Factory factory = FactoryProducer.getFactory(FactoryType.User); // Meminta instance / object UserFactory kepada FactoryProducer

        Integer nik = 2110151023; // Inisialisasi nik user
        String nameUser = "Faza Zulfika P P"; // Inisialisasi name user
        String email = "fazazulfikapp@it.student.pens.ac.id"; // Inisialisasi email user

        User user = factory.getUser(nik, nameUser, email, UserStatus.Student); // Meminta instance / object user kepada factory
        user.introduction(); // Menampilkan informasi user

        factory = FactoryProducer.getFactory(FactoryType.Animal); // Meminta instance / object AnimalFactory kepada FactoryProducer

        Integer age = 3; // Inisialisasi nik animal
        String nameAnimal = "Catty"; // Inisialisasi name animal

        Animal cat = factory.getAnimal(age, nameAnimal, AnimalType.Cat); // Meminta instance / object cat kepada factory
        cat.information(); // Menampilkan informasi animal
    }
}
