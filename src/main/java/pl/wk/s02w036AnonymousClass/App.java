package pl.wk.s02w036AnonymousClass;

class Machine {
    public void start() {
        System.out.println("Star machine");
    }
}

interface Plant {
    public void grow();
}

public class App {
    public static void main(String[] args) {

        // Anonymous class = klasa z nadpisana metoda
        Machine machine1 = new Machine(){
            @Override
            public void start() {
                System.out.println("Camera snapping");
            }
        };

        machine1.start();

        Plant plant1 = new Plant() {
            @Override
            public void grow() {
                System.out.println("Plant growing");
            }
        };

        plant1.grow();

    }
}
