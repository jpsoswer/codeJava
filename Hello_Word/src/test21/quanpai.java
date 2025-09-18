package test21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class quanpai {
    static List<List<Integer>> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] v = new int[n+1];
        int count=0;
        List<Integer> tvIntegers =new ArrayList<>();
        dfs(n,v,tvIntegers);
        for (int i = 0; i<list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j)+" ");
            }
            count++;
            System.out.println();
        }
        System.out.println(count);
    }
    public static void dfs(int n,int[] v,List<Integer> tIntegers)
    {
        if(tIntegers.size()==n)
        {
            list.add(new ArrayList<>(tIntegers));
            return;
        }
        for (int i = 1; i <= n; i++) {
            if(v[i]==1)
            {
                continue;
            }
            v[i]=1;
            tIntegers.add(i);
            dfs(n,v,tIntegers);
            v[i]=0;
            tIntegers.remove(tIntegers.size()-1);
        }
    }
}
