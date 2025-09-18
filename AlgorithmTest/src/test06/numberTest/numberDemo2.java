package test06.numberTest;
//3.1415926、12345678.123456789
public class numberDemo2 {
    public static void main(String[] args) {
        double x = 3.1415926;
        double y = 12345678.123456789;
        System.out.printf("%.6f %.6fe+000",x,x);
        System.out.println();
        System.out.printf("%.6f %.6fe+007",y,y/10000000);
    }
}
