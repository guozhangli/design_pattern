package prototype_pattern;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable {
    private String name;
    private ArrayList<String> hobbies;

    public Person(String name) {
        this.name = name;
        hobbies = new ArrayList<>();
        System.out.println("chu shi hua");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addHobbies(String hobbie) {
        hobbies.add(hobbie);
    }

    /**
     * 浅拷贝
     *
     * @return
     */
    public Person clone() {
        Person clone = null;
        try {
            clone = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    /**
     * 深拷贝
     *
     * @return
     */
    public Person clone2() {
        Person person = null;
        try {
            person = (Person) super.clone();
            person.hobbies = (ArrayList<String>) this.hobbies.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
