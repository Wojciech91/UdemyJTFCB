package pl.wk.s02w026Inheritance;

public class App {
    public static void main(String[] args) {
        Machine mach1 = new Machine("Tank", 1945, "Wojsko polskie", 1000);

        mach1.info();
        mach1.setPrice2(1.1);
        mach1.info();
        System.out.println(mach1.getName());
        System.out.println();

        Car car1 = new Car("Panda", 1999, "Fiat", 2000, 7);

        car1.info();
        car1.setPrice2(1.1);
        car1.setWheels(8);
        car1.info();
        System.out.println(car1.getName());
        car1.setName("500");
        car1.info();
        System.out.println();



//        mach1.start();
//        mach1.stop();
//
//        Car car1 = new Car();
//
//        car1.start();
//        car1.wipeWindShield();
//        car1.stop();
//        car1.showInfo();

    }

}
