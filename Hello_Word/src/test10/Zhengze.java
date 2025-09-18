package test10;

public class Zhengze {
    public static void main(String[] args) {
        String str = "37098320050227611x";
        String gui = "[1-9]\\d{2,17}(?i)x";
        System.out.println(str.matches(gui));
    }
}
