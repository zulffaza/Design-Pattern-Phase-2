package structural.adapter.adapter;

import structural.adapter.legacy.model.Users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Merupakan class yang mengimplementasikan Adapter Pattern
 *
 * @author Faza Zulfika P P
 * @version 1.0.0
 * @since 14 January 2018
 */
public class UsersAdapter {

    /**
     * Merupakan instance / object dari legacy model Users
     */
    private Users users;

    /**
     * Merupakan instance / object temporary yang digunakan untuk menyimpan data dari legacy model Users
     */
    private List<String> usersName;

    /**
     * Merupakan default constructor dari UsersAdapter
     */
    public UsersAdapter() {
        users = new Users(); // Menginisialisasi instance / object dari legacy model Users
    }

    /**
     * Merupakan method yang digunakan untuk menambahkan userName baru
     *
     * @param userName merupakan userName baru yang akan disimpan
     */
    public void addUserName(String userName) {
        usersName = new ArrayList<>(Arrays.asList(users.getUsersName())); // Mengambil seluruh usersName yang ada
        usersName.add(userName); // Menambahkan userName baru

        users.setUsersName(usersName.toArray(new String[0])); // Menyimpannya ke dalam usersName
    }

    /**
     * Merupakan method yang digunakan untuk mengambil userName sesuai indexnya
     *
     * @param index merupakan index penyimpanan userName tersebut
     * @return merupakan userName yang diinginkan
     */
    public String getUserName(int index) {
        usersName = new ArrayList<>(Arrays.asList(users.getUsersName())); // Mengambil seluruh userName yang ada
        return usersName.get(index); // Mengambil userName sesuai indexnya
    }

    /**
     * Merupakan method yang digunakan untuk menghapus userName sesuai indexnya
     *
     * @param index merupakan index penyimpanan userName tersebut
     * @return merupakan userName yang dihapus
     */
    public String removeUserName(int index) {
        String userName;

        usersName = new ArrayList<>(Arrays.asList(users.getUsersName())); // Mengambil seluruh userName yang ada
        userName = usersName.remove(index); // Menghapus userName sesuai indexnya

        users.setUsersName(usersName.toArray(new String[0])); // Menyimpan perubahan ke dalam usersName

        return userName; // Mengembalikan userName yang dihapus
    }

    /**
     * Merupakan method yang digunakan untuk mengetahui jumlah dari userName yang disimpan
     *
     * @return merupakan jumlah dari userName yang disimpan
     */
    public int getSize() {
        return users.getUsersName().length; // Mengambil jumlah dari userName yang disimpan
    }

    /**
     * Merupakan method untuk menampilkan seluruh userName yang disimpan
     */
    public void showAllUserName() {
        users.showUsersName(); // Menampilkan seluruh userName yang disimpan
    }
}
