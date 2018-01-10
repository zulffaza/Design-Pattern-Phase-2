package creational.factory.abstractclass.model;

/**
 * Merupakan salah satu child dari interface User
 *
 * @author Faza Zulfika P P
 * @since 9 January 2018
 * @version 1.0.0
 */
public class Lecturer implements User {

    /**
     * Field nik Lecturer, bertipe Integer
     */
    private Integer nik;

    /**
     * Field name Lecturer, bertipe String
     */
    private String name;

    /**
     * Field email Lecturer, bertipe String
     */
    private String email;

    /**
     * Merupakan default constructor dari Lecturer
     */
    public Lecturer() {
        // Default constructor
    }

    /**
     * Merupakan constructor yang menerima tiga parameter, nik, name, dan email
     *
     * @param nik merupakan nik dari Lecturer
     * @param name merupakan name dari Lecturer
     * @param email merupakan email dari Lecturer
     */
    public Lecturer(Integer nik, String name, String email) {
        this.nik = nik;
        this.name = name;
        this.email = email;
    }

    /**
     * Getter dari field nik
     *
     * @return merupakan nik dari Lecturer
     */
    public Integer getNik() {
        return nik;
    }

    /**
     * Setter dari field nik
     *
     * @param nik merupakan nik dari Lecturer
     */
    public void setNik(Integer nik) {
        this.nik = nik;
    }

    /**
     * Getter dari field name
     *
     * @return merupakan name dari Lecturer
     */
    public String getName() {
        return name;
    }

    /**
     * Setter dari field name
     *
     * @param name merupakan name dari Lecturer
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter dari field email
     *
     * @return merupakan email dari Lecturer
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter dari field email
     *
     * @param email merupakan email dari Lecturer
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Merupakan method untuk menampilkan info Lecturer
     */
    @Override
    public void introduction() {
        System.out.println("");
        System.out.println("Lecturer :");
        System.out.println("Nik : " + nik);
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("");
    }
}
