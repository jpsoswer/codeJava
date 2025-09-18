package test9;

public class hanc {
    public static void main(String[] args) {
        String s = "hello";
        s.matches("^[1-9]\\d{7}(?:0\\d|10|11|12)(?:0[1-9]|[1-2][\\d]|30|31)\\d{3}");
    }
}
