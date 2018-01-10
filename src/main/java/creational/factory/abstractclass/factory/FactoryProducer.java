package creational.factory.abstractclass.factory;

/**
 * Merupakan class factory yang mengatur dibuatnya instance / object Factory sesuai tipenya
 *
 * @author Faza Zulfika P P
 * @version 1.0.0
 * @since 10 January 2018
 */
public class FactoryProducer {

    /**
     * Method yang digunakan untuk membuat instance / object Factory sesuai tipenya
     *
     * @param factoryType merupakan tipe dari Factory
     * @return merupakan instance / object dari Factory
     */
    public static Factory getFactory(FactoryType factoryType) {
        if (factoryType == null) // Jika factorytype tidak ada
            return null; // Mengembalikan null

        /*
            Pengecekan tipe factory
         */
        switch (factoryType) {
            case User: // Jika tipenya user
                return new UserFactory(); // Membuat instance / object UserFactory
            case Animal: // Jika statusnya Student
                return new AnimalFactory(); // Membuat instance / object AnimalFactory
            default: // Jika factorytype tidak ditemukan
                return null; // Mengembalikan null
        }
    }
}
