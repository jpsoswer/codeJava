package test10;

public class Check {
    public static void main(String[] args) {
        String s = "2975842712";
        boolean b = s.matches("[1-9]\\d{5,19}");
        System.out.println(b);
    }
}
