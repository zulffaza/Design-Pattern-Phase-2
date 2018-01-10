package creational.prototype.cache;

import creational.prototype.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Merupakan class cache yang menyimpan instance / object, dan akan mengclone instance / object tersebut bila diminta
 *
 * @author Faza Zulfika P P
 * @version 1.0.0
 * @since 10 January 2018
 */
public class UserCache {

    /**
     * Merupakan instance / object map untuk menyimpan instance / object yang ingin di clone
     */
    private static Map<String, User> userMap = new HashMap<>();

    /**
     * Method yang digunakan untuk mengclone instance / object berdasarkan userId
     *
     * @param userId merupakan key dari instance / object User yang disimpan di cache
     * @return merupakan instance / object User dari cache yang telah di clone
     */
    public static User getUser(String userId) {
        User cachedUser = userMap.get(userId); // Mengambil instance / object di dalam cache berdasarkan userId
        User clonedUser = null; // Membuat instance / object reference untuk menampung instance / object clone

        if (cachedUser != null) { // Mengecek apakah instance / object ditemukan di cache
            try {
                clonedUser = cachedUser.clone(); // Mengclone instance / object yang ditemukan
            } catch (CloneNotSupportedException e) { // Jika instance / object tidak dapat di clone
                e.printStackTrace(); // Mencetak error yang didapatkan
            }
        }

        return clonedUser; // Mengembalikan instance / object hasli clone
    }

    /**
     * Method untuk menyimpan instance / object User didalam cache
     *
     * @param userId merupakan key dari instance / object yang ingin disimpan
     * @param user   merupakan instance / object yang ingin disimpan
     * @return merupakan keterangan penyimpanan berhasil ataukah tidak
     */
    public static boolean saveUser(String userId, User user) {
        boolean isNotAdded = !userMap.containsKey(userId); // Mengecek apakah userId telah digunakan atau belum

        if (isNotAdded) // Jika belum digunakan
            isNotAdded = userMap.put(userId, user) != null; // Maka instance / object User disimpan dalam cache

        return isNotAdded; // Mengembalikan keterangan penyimpanan berhasil ataukah tidak
    }

    /**
     * Method yang digunakan untuk menghapus instance / object dari cache
     *
     * @param userId merupakan key dari instance / object yang ingin dihapus
     * @return merupakan keterangan penghapusan berhasil atau tidak
     */
    public static boolean removeUser(String userId) {
        return userMap.remove(userId) != null; // Menghapus instance / object, dan mengembalikan keterangannya
    }

    /**
     * Method untuk mengkosongkan isi dari cache
     */
    public static void clearCache() {
        userMap.clear(); // Menghapus seluruh isi dari cache
    }
}
