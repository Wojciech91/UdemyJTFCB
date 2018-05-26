package pl.wk.s02w041AbstractClasses;

public class Camera extends Machine {
    @Override
    public void start() {
        System.out.println("Camera Starting");
    }

    @Override
    public void doStuff() {
        System.out.println("Do stuff with camera.");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutdown Camera");
    }
}
