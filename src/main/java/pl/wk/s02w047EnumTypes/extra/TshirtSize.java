package pl.wk.s02w047EnumTypes.extra;

public enum TshirtSize {
    S(10),M(11),L(12),XL(13);

    private int number;

    TshirtSize(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
