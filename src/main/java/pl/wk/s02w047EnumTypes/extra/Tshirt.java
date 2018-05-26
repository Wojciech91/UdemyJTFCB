package pl.wk.s02w047EnumTypes.extra;

import java.util.Arrays;

public class Tshirt {
    private TshirtSize size;
    private String manufacture;

    public Tshirt(TshirtSize size, String manufacture) {
        this.size = size;
        this.manufacture = manufacture;
    }

    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(TshirtSize.L, "IBM");
        System.out.println(tshirt.size);

        switch (tshirt.size) {
            case S:
                System.out.println("SS");
                break;
            case M:
                System.out.println("MM");
                break;
            case L:
                System.out.println("LL");
                break;
            case XL:
                System.out.println("XLXL");
                break;
        }


        System.out.println(TshirtSize.XL.getNumber());
        TshirtSize.XL.setNumber(24);
        System.out.println(TshirtSize.XL.getNumber());
        System.out.println(Arrays.toString(TshirtSize.values()));

        for (TshirtSize value: TshirtSize.values()) {
            System.out.println(value);
        }
    }


}
