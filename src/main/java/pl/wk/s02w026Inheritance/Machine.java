package pl.wk.s02w026Inheritance;

public class Machine {

    protected String name;
    private int date;
    private String producent;
    private double price;
    private double price2;

    public Machine(String name, int date, String producent, double price) {
        this.name = name;
        this.date = date;
        this.producent = producent;
        this.price = price;
    }

    public void info() {
        System.out.println("I,m machine " + name + ", year " + date + ", producent " + producent + ", price: " + price + ", price2: " + price2);
    }

    public void setPrice2(double margin) {
        this.price2 = this.price * margin;
    }

    public String getName() {
        return name;
    }

    //    String type = "Machine type 1";
//
//
//    public void start() {
//        System.out.println("Machine started.");
//    }
//
//    public void stop() {
//        System.out.println("Machine stoped.");
//    }
}
