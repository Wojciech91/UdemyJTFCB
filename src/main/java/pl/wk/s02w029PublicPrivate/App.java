package pl.wk.s02w029PublicPrivate;

import pl.wk.s02w029PublicPrivate.world.Plant;

/*
* private - only within same class
* public - from anywhare
* protected - same class, subclass, and same package
* no modifier - same package only
*/

public class App {
    public static void main(String[] args) {
        Plant plant = new Plant();

        System.out.println(plant.name);

        System.out.println(plant.ID);

//        type is private - dont work
//        System.out.println(plant.type);

        // size is protected; App is not in the same package as Plant
        //Won't work
//        System.out.println(plant.size);

        // Won't work; App and Plant is different packages, height has package - level visibility
//        System.out.println(plant.height);

    }
}
