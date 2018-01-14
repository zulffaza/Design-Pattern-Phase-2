package structural.adapter.legacy.model;

/**
 * Merupakan class legacy yang ingin diakses
 *
 * @author Faza Zulfika P P
 * @version 1.0.0
 * @since 14 January 2018
 */
public class Users {

    /**
     * Field usersName dari Users, bertipe array of String
     */
    private String[] usersName;

    /**
     * Merupakan default constructor dari Users
     */
    public Users() {
        usersName = new String[0]; // Menginisialisasi usersName dengan array kosong
    }

    /**
     * Getter dari field usersName
     *
     * @return merupakan usersName dari Users
     */
    public String[] getUsersName() {
        return usersName;
    }

    /**
     * Setter dari field usersName
     *
     * @param usersName merupakan usersName dari Users
     */
    public void setUsersName(String[] usersName) {
        this.usersName = usersName;
    }

    /**
     * Merupakan method yang digunakan untuk menampilkan seluruh isi dari field usersName
     */
    public void showUsersName() {
        System.out.println("");

        /*
            Melakukan looping untuk mengakses seluruh isi dari field usersName
         */
        for (String userName : usersName)
            System.out.println(userName);

        System.out.println("");
    }
}
