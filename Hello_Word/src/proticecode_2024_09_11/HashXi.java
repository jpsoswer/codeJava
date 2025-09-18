package proticecode_2024_09_11;

import java.util.HashMap;
import java.util.Scanner;

public class HashXi {
    HashMap<Integer,String> mond = new HashMap<Integer,String>();
    public HashXi(){
        mond.put(1,"penny");
        mond.put(10,"dime");
        mond.put(25,"quarter");
        mond.put(50,"half-dolar");
        for(Integer s: mond.keySet())
        {
            String k = mond.get(s);
            System.out.println(k + ":" + s);
        }
        //System.out.println(mond);
    }
    public String getname(int amount)
    {
        if(mond.containsKey(amount))
            return mond.get(amount);
        else
            return "NOT FOUND";
    }
    public static void main(String[] args) {
        HashXi ha = new HashXi();
        Scanner in = new Scanner(System.in);
        String xi = "";
        xi = ha.getname(in.nextInt());
        System.out.println(xi);
    }
}
