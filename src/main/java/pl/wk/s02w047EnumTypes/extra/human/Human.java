package pl.wk.s02w047EnumTypes.extra.human;

public class Human {
    private String name;
    private int age;
    private EyeColor eyeColor;
    private HairColor hairColor;

    public Human(String name, int age, EyeColor eyeColor, HairColor hairColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", eyeColor=" + eyeColor +
                ", hairColor=" + hairColor +
                '}';
    }

    public static void main(String[] args) {
        Human human = new Human("Wojtek", 25, EyeColor.BLUE, HairColor.valueOf("BLONDE") );
        System.out.println(human);
    }

}
