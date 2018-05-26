package pl.wk.s02w026Inheritance;

public class Car extends Machine {

    private int wheels;

    public Car(String name, int date, String producent, double price) {
        super(name, date, producent, price);
    }

    public Car(String name, int date, String producent, double price, int wheels) {
        super(name, date, producent, price);
        this.wheels = wheels;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Wheels: " + wheels);
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setName(String name) {
        this.name = name;
    }



    //    public void wipeWindShield() {
//        System.out.println("Wiping windshield");
//    }
//
//    public void start() {
//        System.out.println("Car started.");
//    }
//
//    public void showInfo() {
//        System.out.println("Car type: " + type);
//    }
}
