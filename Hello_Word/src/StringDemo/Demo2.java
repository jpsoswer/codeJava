package StringDemo;

public class Demo2 {
    public static void main(String[] args) {
        String fan = remofan("hello");
        System.out.println(fan);
    }
    public static String remofan(String s)
    {
        String arr = "";
        for(int i = s.length()-1;i >= 0;i--)
        {
            arr+=s.charAt(i);
        }
        return arr;
    }
}
