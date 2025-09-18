package test23;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class paiXV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        ArrayList<Integer> list = new ArrayList<>();
        //将输入的元素存放到集合中
        for(int i=0;i<n;i++)
        {
            String string = scanner.nextLine();
            for(String s: string.split(" "))
            {
                list.add(Integer.valueOf(s));
            }
        }
        //将集合中的数据都存放到数组之中
        Integer[] it = new Integer[list.size()];
        it = list.toArray(it);
        //对数组进行排序
        Arrays.sort(it);
        //遍历数组
        int m=0;
        int k = 0;
        for (int i = 1; i < it.length; i++) {
            if(it[i]-it[i-1]>1)
            {
                m = it[i-1]+1;
            }
            if(it[i].equals(it[i-1]))
            {
                k=it[i-1];
            }
            if(m*k>0)
            {
                System.out.println(m+ " " +k);
                break;
            }
        }
    }
}
