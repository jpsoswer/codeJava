package day_2025_1_3_1;

public class test {
    public static void main(String[] args) {
        jvXing jvxing = new jvXing(4,5);
        double a = jvxing.mianji();
        yuanXing yuanxing = new yuanXing(2.5);
        double b = yuanxing.mianji();
        System.out.println("矩形的面积为：" + a +"  圆形的面积为：" + b);
    }
}
