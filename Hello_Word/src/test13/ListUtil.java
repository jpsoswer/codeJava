package test13;

public class  ListUtil<E> {
    public static <E> String addAll(E e)
    {
        return "true";
    }
}
class test{
    public static void main(String[] args) {
        String s = "hello";
        ListUtil.addAll(s);
        int b = 12;
        ListUtil.addAll(b);
        foreath fe = new foreath();
        ListUtil.addAll(fe);

    }
}
