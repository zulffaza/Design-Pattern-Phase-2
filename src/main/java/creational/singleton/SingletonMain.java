package creational.singleton;

import creational.singleton.model.SingletonUser;

/**
 * Class untuk melakukan testing design pattern singleton
 *
 * @author Faza Zulfika P P
 * @since 9 January 2018
 * @version 1.0.0
 */
public class SingletonMain {

    /**
     * Method main dari aplikasi
     *
     * @param args merupakan input dari user
     */
    public static void main(String[] args) {
        Integer nrp = 2110151023; // Inisialisasi NRP awal
        String name = "Faza Zulfika P P"; // Inisialisasi Nama Awal

        SingletonUser singletonUser1 = SingletonUser.getInstance(); // Mengambil instance / object SingletonUser

        singletonUser1.setNrp(nrp); // Menset Nrp
        singletonUser1.setName(name); // Menset Name

        System.out.println("---------- singletonUser1 ----------");

        printSingletonUser(singletonUser1); // Menampilkan isi instance / object

        System.out.println("---------- End singletonUser1 ----------");
        System.out.println("");

        System.out.println("---------- Change NRP of singletonUser1 ----------");
        System.out.println("");
        System.out.println("Nrp : " + singletonUser1.getNrp()); // Menampilkan nrp sebelum diubah

        singletonUser1.setNrp(2110151001); // Nrp diubah

        System.out.println("Nrp : " + singletonUser1.getNrp()); // Menampilkan nrp setelah diubah
        System.out.println("");
        System.out.println("---------- End change NRP of singletonUser1 ----------");
        System.out.println("");

        SingletonUser singletonUser2 = SingletonUser.getInstance(); // Mengambil instance / object SingletonUser dan disimpan di variabel lain

        System.out.println("---------- singletonUser2 ----------");

        printSingletonUser(singletonUser2); // Menampilkan isi instance / object

        System.out.println("---------- End singletonUser2 ----------");
        System.out.println("");
    }

    /**
     * Method untuk menampilkan isi instance / object SingletonUser
     *
     * @param singletonUser merupakan object yang ingin di tampilkan isinya
     */
    private static void printSingletonUser(SingletonUser singletonUser) {
        System.out.println("");
        System.out.println("Nrp : " + singletonUser.getNrp());
        System.out.println("Name : " + singletonUser.getName());
        System.out.println("");
    }
}
