package proticecode_2024_09_12;

import java.util.ArrayList;

public class Address {
    private ArrayList<String> arr = new ArrayList<String>();
    public void xinxi(String x)
    {
        arr.add(x);
    }
    public String[] getlist()
    {
        String[] a = new String[arr.size()];
        arr.toArray(a);
        return a;
    }
    public static void main(String[] args) {
        Address x = new Address();
        x.xinxi("中国");
        x.xinxi("山东");
        x.xinxi("章丘");
        x.xinxi("双山");
        x.xinxi("1213");
        String[] s = x.getlist();
        for(String z: s)
        {
            System.out.println(z);
        }
    }
}
