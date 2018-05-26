package pl.wk.s02w029PublicPrivate.world;

public class Field {
    private Plant plant = new Plant();

    public Field() {

        //size is protected; filed is the same package as Plant
        System.out.println(plant.size);
    }
}
