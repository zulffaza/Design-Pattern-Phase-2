package creational.factory.abstractclass.model;

/**
 * Merupakan salah satu child dari interface Animal
 *
 * @author Faza Zulfika P P
 * @version 2.0.0
 * @since 10 January 2018
 */
public class Cat extends Animal {

    /**
     * Merupakan default constructor dari Cat
     */
    public Cat() {
        // Default constructor
    }

    /**
     * Merupakan constructor yang menerima dua parameter, age dan name
     *
     * @param age  merupakan age dari Animal
     * @param name merupakan name dari Animal
     */
    public Cat(Integer age, String name) {
        setAge(age);
        setName(name);
    }

    /**
     * Merupakan method untuk menampilkan info dari Cat
     */
    @Override
    public void information() {
        System.out.println("");
        System.out.println("Cat : ");
        System.out.println("Age : " + getAge());
        System.out.println("Name : " + getName());
        System.out.println("");
    }
}
