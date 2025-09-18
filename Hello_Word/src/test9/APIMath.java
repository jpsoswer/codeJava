package test9;

public class APIMath {
    public static void main(String[] args) {
        double a = 5.3;
        double b = 5.6;
        //绝对值
        System.out.println(Math.abs(a));
        //向下取整
        System.out.println(Math.floor(b));
        //向上取整
        System.out.println(Math.ceil(a));
        //四舍五入
        System.out.println(Math.round(a));
        System.out.println(Math.round(b));
        //随机值
        System.out.println((int)(Math.random()*10)+1);
    }
}
