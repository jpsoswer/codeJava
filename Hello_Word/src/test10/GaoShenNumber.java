package test10;

public class GaoShenNumber {
    public static void main(String[] args) {
        String s = "17098320070217266x";
        String person = "[1-9]\\d{5}[12]\\d{3}((0\\d)|(1[012]))(([12]\\d)|[3][0])\\d{3}[0-9(?i)x]";
        String person1 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|10|11|12)(0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
        boolean b = s.matches(person);
        boolean b1 = s.matches(person1);
        System.out.println(b);
        System.out.println(b1);
    }
}
