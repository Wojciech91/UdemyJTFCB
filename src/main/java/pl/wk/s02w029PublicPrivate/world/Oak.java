package pl.wk.s02w029PublicPrivate.world;

public class Oak extends Plant {

    public Oak() {

        // Wont work - type is private
//        type = "tree";

        // This works - size is protected, Oak is a subclass
        this.size = "large";
        this.height = 9;

    }
}
