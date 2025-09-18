package day_2025_1_2_1;

public class sanJiaoXing implements tuXing,color{
    private double zhijiao1;
    private double zhijiao2;
    private double xiebian;

    public sanJiaoXing() {
    }

    public sanJiaoXing(double zhijiao1, double zhijiao2, double xiebian) {
        this.zhijiao1 = zhijiao1;
        this.zhijiao2 = zhijiao2;
        this.xiebian = xiebian;
    }

    public double getZhijiao1() {
        return zhijiao1;
    }

    public void setZhijiao1(double zhijiao1) {
        this.zhijiao1 = zhijiao1;
    }

    public double getZhijiao2() {
        return zhijiao2;
    }

    public void setZhijiao2(double zhijiao2) {
        this.zhijiao2 = zhijiao2;
    }

    public double getXiebian() {
        return xiebian;
    }

    public void setXiebian(double xiebian) {
        this.xiebian = xiebian;
    }

    @Override
    public void zhoucahng() {
        System.out.println("三角形的周长为：" + (zhijiao1+zhijiao2+xiebian));
    }

    @Override
    public void mianji() {
        System.out.println("三角形的面积为：" + (zhijiao1*zhijiao2*0.5));
    }

    @Override
    public void red() {
        System.out.println("红色的三角形");
    }

    @Override
    public void green() {
        System.out.println("绿色的三角形");
    }

    @Override
    public void blue() {
        System.out.println("蓝色的三角形");
    }
}
