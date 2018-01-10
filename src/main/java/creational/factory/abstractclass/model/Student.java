package creational.factory.abstractclass.model;

/**
 * Merupakan salah satu child dari interface User
 *
 * @author Faza Zulfika P P
 * @version 2.0.0
 * @since 9 January 2018
 */
public class Student extends User {

    /**
     * Merupakan default constructor dari Student
     */
    public Student() {

    }

    /**
     * Merupakan constructor yang menerima tiga parameter, nik, name, dan email
     *
     * @param nik   merupakan nik dari Student
     * @param name  merupakan name dari Student
     * @param email merupakan email dari Student
     */
    public Student(Integer nik, String name, String email) {
        setNik(nik);
        setName(name);
        setEmail(email);
    }

    /**
     * Merupakan method untuk menampilkan info Student
     */
    @Override
    public void introduction() {
        System.out.println("");
        System.out.println("Student :");
        System.out.println("Nik : " + getNik());
        System.out.println("Name : " + getName());
        System.out.println("Email : " + getEmail());
        System.out.println("");
    }
}
