package test3;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("苹果",8000);
        Phone p3 = new Phone("锤子",2999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getPhoneage() <= 3000)
            {
                System.out.println(list.get(i).getPhonename() + ", " +list.get(i).getPhoneage());
            }
        }
    }
}
