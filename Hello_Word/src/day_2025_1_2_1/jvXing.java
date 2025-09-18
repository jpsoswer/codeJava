package day_2025_1_2_1;

public class jvXing implements tuXing,color{
    private double bian1;
    private double bian2;

    public jvXing() {
    }

    public jvXing(double bian1, double bian2) {
        this.bian1 = bian1;
        this.bian2 = bian2;
    }

    public double getBian1() {
        return bian1;
    }

    public void setBian1(double bian1) {
        this.bian1 = bian1;
    }

    public double getBian2() {
        return bian2;
    }

    public void setBian2(double bian2) {
        this.bian2 = bian2;
    }

    @Override
    public void zhoucahng() {
        System.out.println("矩形的周长为：" + (2*(bian1+bian2)));
    }

    @Override
    public void mianji() {
        System.out.println("矩形的面积为：" + (bian1*bian2));
    }

    @Override
    public void red() {
        System.out.println("红色的矩形");
    }

    @Override
    public void green() {
        System.out.println("绿色的矩形");
    }

    @Override
    public void blue() {
        System.out.println("蓝色的矩形");
    }
}
