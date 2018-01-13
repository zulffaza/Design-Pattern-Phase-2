package creational.objectpool.model;

/**
 * Merupakan class yang akan disimpan didalam object pool
 *
 * @author Faza Zulfika P P
 * @version 1.0.0
 * @since 13 January 2017
 */
public class User {

    /**
     * Field nrp user, bertipe Integer
     */
    private Integer nrp;

    /**
     * Field name user, bertipe String
     */
    private String name;

    /**
     * Merupakan default constructor yang menerima dua parameter, nrp dan name
     *
     * @param nrp  merupakan nrp user
     * @param name merupakan name user
     */
    public User(Integer nrp, String name) {
        this.nrp = nrp;
        this.name = name;
    }

    /**
     * Getter dari field nrp
     *
     * @return nrp dari user
     */
    public Integer getNrp() {
        return nrp;
    }

    /**
     * Setter dari field nrp
     *
     * @param nrp merupakan nrp dari user
     */
    public void setNrp(Integer nrp) {
        this.nrp = nrp;
    }

    /**
     * Getter dari field name
     *
     * @return name dari user
     */
    public String getName() {
        return name;
    }

    /**
     * Setter dari field name
     *
     * @param name merupakan name dari user
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Merupakan method untuk menampilkan info User
     */
    public void introduction() {
        System.out.println("");
        System.out.println("User :");
        System.out.println("Nrp : " + getNrp());
        System.out.println("Name : " + getName());
        System.out.println("");
    }
}
