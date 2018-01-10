package creational.factory.abstractclass.model;

/**
 * Merupakan class yang diimplementasi kepada semua yang dikelola animal factory
 *
 * @author Faza Zulfika P P
 * @version 2.0.0
 * @since 10 January 2018
 */
public abstract class Animal {

    /**
     * Field age Animal, bertipe data Integer
     */
    private Integer age;

    /**
     * Field name Animal, bertipe data String
     */
    private String name;

    /**
     * Getter dari field age
     *
     * @return merupakan age dari Animal
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Setter dari field age
     *
     * @param age merupakan age dari Animal
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Getter dari field name
     *
     * @return merupakan name dari Animal
     */
    public String getName() {
        return name;
    }

    /**
     * Setter dari field name
     *
     * @param name merupakan name dari Animal
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Merupakan method untuk menampilkan informasi dari animal
     */
    public abstract void information();
}
