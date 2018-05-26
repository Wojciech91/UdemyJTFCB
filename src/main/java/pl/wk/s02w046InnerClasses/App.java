package pl.wk.s02w046InnerClasses;

public class App {
    public static void main(String[] args) {
        Robot robot = new Robot(4);

        robot.start();

//        Robot.Brain brain = robot.new Brain();
//        brain.think();

        Robot.Battery battery = new Robot.Battery();
        battery.charge();

    }
}
