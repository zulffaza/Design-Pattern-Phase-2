package creational.factory.abstractclass.model;

/**
 * Merupakan salah satu child dari interface Animal
 *
 * @author Faza Zulfika P P
 * @since 10 January 2018
 * @version 1.0.0
 */
public class Dog implements Animal {

    /**
     * Field age Animal, bertipe data Integer
     */
    private Integer age;

    /**
     * Field name Animal, bertipe data String
     */
    private String name;

    /**
     * Merupakan default constructor dari Dog
     */
    public Dog() {
        // Default constructor
    }

    /**
     * Merupakan constructor yang menerima dua parameter, age dan name
     *
     * @param age merupakan age dari Animal
     * @param name merupakan name dari Animal
     */
    public Dog(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * Getter dari field age
     *
     * @return merupakan age dari Dog
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Setter dari field age
     *
     * @param age merupakan age dari Dog
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Getter dari field name
     *
     * @return merupakan name dari Dog
     */
    public String getName() {
        return name;
    }

    /**
     * Setter dari field name
     *
     * @param name merupakan name dari Dog
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Merupakan method untuk menampilkan info dari Dog
     */
    @Override
    public void information() {
        System.out.println("");
        System.out.println("Dog :");
        System.out.println("Age : " + age);
        System.out.println("Name : " + name);
        System.out.println("");
    }
}
