package Iterator;

import java.util.Iterator;

public class FullName {
    private String surname;
    private String name;
    private int age;

    public FullName(String surname, String name, int age) {
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public String getSurname() {
        return this.surname;

    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    public void printFullName(){
        System.out.println("name: " + name + " surname: " + surname + " age: " + age);

    }
}
