package creational.factory.method.model;

/**
 * Merupakan salah satu child dari interface User
 *
 * @author Faza Zulfika P P
 * @version 2.0.0
 * @since 9 January 2018
 */
public class Lecturer extends User {

    /**
     * Merupakan default constructor dari Lecturer
     */
    public Lecturer() {

    }

    /**
     * Merupakan constructor yang menerima tiga parameter, nik, name, dan email
     *
     * @param nik   merupakan nik dari Lecturer
     * @param name  merupakan name dari Lecturer
     * @param email merupakan email dari Lecturer
     */
    public Lecturer(Integer nik, String name, String email) {
        setNik(nik);
        setName(name);
        setEmail(email);
    }

    /**
     * Merupakan method untuk menampilkan info Lecturer
     */
    @Override
    public void introduction() {
        System.out.println("");
        System.out.println("Lecturer :");
        System.out.println("Nik : " + getNik());
        System.out.println("Name : " + getName());
        System.out.println("Email : " + getEmail());
        System.out.println("");
    }
}
