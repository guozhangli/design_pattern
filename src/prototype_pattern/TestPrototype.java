package prototype_pattern;

public class TestPrototype {

    public static void main(String[] args) {
        System.out.println("------------浅拷贝-----------");
        Person person = new Person("zhangsan");
        person.addHobbies("read");
        person.addHobbies("code");
        System.out.println(person.toString());
        Person person1 = person.clone();
        person1.setName("lisi");
        person1.addHobbies("paoniu");
        System.out.println(person.toString());
        System.out.println(person1.toString());
        System.out.println("------------深拷贝-----------");
        Person person2 = new Person("zhangsan");
        person2.addHobbies("read");
        person2.addHobbies("code");
        System.out.println(person2.toString());
        Person person3 = person2.clone2();
        System.out.println(person3.toString());
        person3.setName("lisi");
        person3.addHobbies("paoniu");
        System.out.println(person2.toString());
        System.out.println(person3.toString());
    }
}
