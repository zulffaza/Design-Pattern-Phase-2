package creational.singleton.model;

/**
 * Merupakan class yang mengimplementasikan Singleton Pattern
 *
 * @author Faza Zulfika P P
 * @since 9 January 2018
 * @version 1.0.0
 */
public class SingletonUser {

    /**
     * Instance / object static SingletonUser untuk menyimpan instance / object yang dibuat
     */
    private static SingletonUser INSTANCE = null;

//    /**
//     * Instance / object static SingletonUser untuk menyimpan instance / object yang dibuat
//     * Menggunakan eager initialization
//     */
//    private static SingletonUser INSTANCE = new SingletonUser();

    /**
     * Field nrp user, bertipe Integer
     */
    private Integer nrp;

    /**
     * Field name user, bertipe String
     */
    private String name;

    /**
     * Method untuk mengambil instance / object dari SingletonUser
     * Menggunakan lazy initialization
     *
     * @return instance / object dari SingletonUser
     */
    public static SingletonUser getInstance() {
        /*
            Hapus kedua baris ini jika ingin menggunakan eager initialization
         */
        if (INSTANCE == null) // Mengecek apakah belum ada instance / object yang dibuat
            INSTANCE = new SingletonUser(); // Jika belum ada, maka dibuat instance / objectnya

        return INSTANCE; // Mengembalikan instance / objectnya
    }

    /**
     * Merupakan default constructor dari SingletonUser
     */
    private SingletonUser() {
        // Default constructor
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
}
