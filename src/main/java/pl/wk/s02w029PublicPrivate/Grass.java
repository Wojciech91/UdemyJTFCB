package pl.wk.s02w029PublicPrivate;

import pl.wk.s02w029PublicPrivate.world.Plant;

public class Grass extends Plant {
    public Grass() {

        // Won't work - Grass not in same package as plant
//        System.out.println(this.height);
    }
}
