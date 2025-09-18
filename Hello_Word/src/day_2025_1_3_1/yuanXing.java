package day_2025_1_3_1;

public class yuanXing extends tuXing{
    private double banjing;

    public yuanXing(double banjing) {
        this.banjing = banjing;
    }

    public double getBanjing() {
        return banjing;
    }

    @Override
    public double mianji() {
        return 3.14*banjing*banjing;
    }
}
