package day_2025_1_3_1;

public class jvXing extends tuXing{
    private double bianchang1;
    private double bianchang2;
    public jvXing(double bianchang1, double bianchang2) {
        this.bianchang1 = bianchang1;
        this.bianchang2 = bianchang2;
    }

    public double getBianchang1() {
        return bianchang1;
    }

    public double getBianchang2() {
        return bianchang2;
    }
    @Override
    public double mianji() {
        return bianchang1*bianchang2;
    }
}
