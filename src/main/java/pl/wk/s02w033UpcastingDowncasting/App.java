package pl.wk.s02w033UpcastingDowncasting;

class Machine {
    public void start() {
        System.out.println("Machine started");
    }
}

class Camera extends Machine {
    @Override
    public void start() {
        System.out.println("Camera started");
    }

    public void snap() {
        System.out.println("Photo taken");
    }
}

public class App {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        System.out.println("\nUpcasting");
        //Upacasting
        Machine machine2 = camera1;
        machine2.start();
        //error
//        machine2.snap();

        System.out.println("\nDowncasting");
        //Downcasting
        Machine machine3 = new Camera();
        Camera camera2 = (Camera) machine3;
        machine3.start();
        camera2.start();
        camera2.snap();

        // Dosn't work - runtime wrror
        Machine machine4 = new Machine();
//        Camera camera3 = (Camera) machine4;
//        camera3.start();
//        camera3.snap();



    }
}
