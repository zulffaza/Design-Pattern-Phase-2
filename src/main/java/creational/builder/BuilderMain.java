package creational.builder;

import creational.builder.model.User;

/**
 * Class untuk melakukan testing design pattern builder
 *
 * @author Faza Zulfika P P
 * @version 1.0.0
 * @since 9 January 2018
 */
public class BuilderMain {

    /**
     * Method main dari aplikasi
     *
     * @param args merupakan input dari user
     */
    public static void main(String[] args) {
        Integer nrp = 2110151023; // Inisialisasi NRP awal
        String name = "Faza Zulfika P P"; // Inisialisasi Nama awal
        String email = "fazazulfikapp@it.student.pens.ac.id"; // Inisialisasi Email awal
        String phone = "08564889xxxx"; // Inisialisasi Phone awal
        String address = "Jalan xxxxxxxx Surabaya"; // Inisialisasi Address awal

        User.Builder builder = new User.Builder(nrp, name); // Membuat instance / object builder, dengan menginisialisasi nrp dan name

        builder.setEmail(email); // Menset email user
        builder.setPhone(phone); // Menset phone user
        builder.setAddress(address); // Menset address user

        User user = builder.build(); // Membuat instance / object User melalui builder

        printSingletonUser(user); // Menampilkan isi instance / object user
    }

    /**
     * Method untuk menampilkan isi instance / object User
     *
     * @param user merupakan object yang ingin di tampilkan isinya
     */
    private static void printSingletonUser(User user) {
        System.out.println("");
        System.out.println("Nrp : " + user.getNrp());
        System.out.println("Name : " + user.getName());
        System.out.println("Email : " + user.getEmail());
        System.out.println("Phone : " + user.getPhone());
        System.out.println("Address : " + user.getAddress());
        System.out.println("");
    }
}
