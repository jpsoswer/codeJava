package day_2025_1_2_1;

public class yuan implements tuXing,color{
    private double banjing;

    public yuan() {
    }

    public yuan(double banjing) {
        this.banjing = banjing;
    }

    public double getBanjing() {
        return banjing;
    }

    public void setBanjing(double banjing) {
        this.banjing = banjing;
    }

    @Override
    public void zhoucahng() {
        System.out.println("圆的周长为：" + (2*3.14*banjing));
    }

    @Override
    public void mianji() {
        System.out.println("圆的面积为：" + (3.14*banjing*banjing));
    }

    @Override
    public void red() {
        System.out.println("红色的圆形");
    }

    @Override
    public void green() {
        System.out.println("绿色的圆形");
    }

    @Override
    public void blue() {
        System.out.println("蓝色的圆形");
    }
}
