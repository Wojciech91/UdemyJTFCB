package pl.wk.s02w050SerializingArrays;

import java.io.Serializable;

public class Person2 implements Serializable {
    private int id;
    private String name;

    public Person2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
