package structural.adapter;

import structural.adapter.adapter.UsersAdapter;

/**
 * Class untuk melakukan testing design pattern adapter
 *
 * @author Faza Zulfika P P
 * @version 1.0.0
 * @since 14 January 2018
 */
public class AdapterTest {

    /**
     * Method main dari aplikasi
     *
     * @param args merupakan input dari user
     */
    public static void main(String[] args) {
        UsersAdapter usersAdapter = new UsersAdapter(); // Menginisialisai instance / object UsersAdapter

        /*
            Menambahkan beberapa userName baru
         */
        usersAdapter.addUserName("Faza");
        usersAdapter.addUserName("Zulfika");
        usersAdapter.addUserName("Permana");
        usersAdapter.addUserName("Putra");

        usersAdapter.showAllUserName(); // Menampilkan seluruh userName

        System.out.println("Size of usersname : " + usersAdapter.getSize()); // Menampilkan jumlah seluruh userName
        System.out.println("Username at index 2 : " + usersAdapter.getUserName(2)); // Mengambil userName di index ke 2
        System.out.println("Remove username at index 1 : " + usersAdapter.removeUserName(1)); // Menghapus userName di index ke 1

        usersAdapter.showAllUserName(); // Menampilkan seluruh userName
    }
}
