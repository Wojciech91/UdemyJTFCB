package pl.wk.s02w047EnumTypes;

public enum Animal {
    DOG("Fergus"), CAT ("Fado"), MOUSE("Jerry");

    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "This animal is called: " + name;
    }
}
