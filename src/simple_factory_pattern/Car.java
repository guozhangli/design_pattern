package simple_factory_pattern;

public abstract class Car {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("this is car is " + this.getName());
    }
}
