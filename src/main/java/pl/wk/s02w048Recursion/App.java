package pl.wk.s02w048Recursion;

public class App {

    public static void main(String[] args) {

        // factorial 4! = 4*3*2*1

        System.out.println(factorial(4));

//        calculate(4);


    }

    private static int factorial(int number) {
        System.out.println(number);

        if (number == 1) {
            return 1;
        }

        return factorial(number - 1) * number;
    }

    public static void calculate(int value) {
        System.out.println(value);

        if (value == 0) {
            return;
        }
        calculate(value - 1);
    }
}
