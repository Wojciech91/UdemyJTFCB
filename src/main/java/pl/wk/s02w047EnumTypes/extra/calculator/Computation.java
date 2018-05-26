package pl.wk.s02w047EnumTypes.extra.calculator;

public enum Computation {
    MULTIPLY {
        public double perform(double x, double y) {
            return x*y;
        }
    },
    DIVIDE {
        public double perform(double x, double y) {
            return x/y;
        }
    },
    ADD {
        public double perform(double x, double y) {
            return x+y;
        }
    },
    SUBTRACT {
        public double perform(double x, double y) {
            return x-y;
        }
    };

    public abstract double perform(double x, double y);

    public static void main(String[] args) {
        System.out.println(Computation.ADD.perform(1, 1));
        System.out.println(Computation.SUBTRACT.perform(1, 1));
        System.out.println(Computation.MULTIPLY.perform(2, 2));
        System.out.println(Computation.DIVIDE.perform(2, 2));
    }

}
