package pl.wk.s02w028Interfaces;

public class Person implements Info{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void great() {
        System.out.println("Hello there");
    }

    @Override
    public void showInfo() {
        System.out.println("Person name is: " + name);
    }
}
