package creational.factory.method.model;

/**
 * Merupakan class yang diimplementasi kepada semua yang dikelola factory
 *
 * @author Faza Zulfika P P
 * @version 2.0.0
 * @since 9 January 2018
 */
public abstract class User {

    /**
     * Field nik User, bertipe Integer
     */
    private Integer nik;

    /**
     * Field name User, bertipe String
     */
    private String name;

    /**
     * Field email User, bertipe String
     */
    private String email;

    /**
     * Getter dari field nik
     *
     * @return merupakan nik dari User
     */
    public Integer getNik() {
        return nik;
    }

    /**
     * Setter dari field nik
     *
     * @param nik merupakan nik dari User
     */
    public void setNik(Integer nik) {
        this.nik = nik;
    }

    /**
     * Getter dari field name
     *
     * @return merupakan name dari User
     */
    public String getName() {
        return name;
    }

    /**
     * Setter dari field name
     *
     * @param name merupakan name dari User
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter dari field email
     *
     * @return merupakan email dari User
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter dari field email
     *
     * @param email merupakan email dari User
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Merupakan method untuk menampilkan informasi user
     */
    public abstract void introduction();
}
