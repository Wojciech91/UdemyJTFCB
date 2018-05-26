package pl.wk.s02w031EncapsulationAPIDocs;

class Plant {
    public static final int ID = 7;
    private String name;

    public String getData() {
        String data = "some stuff" + calculate();
        return data;
    }

    private int calculate() {
        return 9;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class App {
    public static void main(String[] args) {

    }
}
