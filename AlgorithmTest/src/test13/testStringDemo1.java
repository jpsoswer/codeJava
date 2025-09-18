package test13;

import java.util.ArrayList;
import java.util.Scanner;
/*

4
summer
spring
summer
spring
输出：
summer(1,3)spring(2,4)
 */
public class testStringDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //用来存储名字
        ArrayList<String> als = new ArrayList<>();
        //用来存储数值
        ArrayList<String> valuels = new ArrayList<>();

        //遍历集合
        for (int i = 1; i <=n; i++) {
            String s = scan.next();
            if(als.contains(s))
            {
                int index = als.indexOf(s);
                String str = valuels.get(index);
                valuels.remove(index);
                valuels.add(index,str+","+i);
            }
            else {
                als.add(s);
                valuels.add(i+"");
            }
        }
        for (int i = 0; i < als.size(); i++) {
            System.out.print(als.get(i)+"("+valuels.get(i)+")");
        }
    }
}
