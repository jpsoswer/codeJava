package test18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DFS{
    static List<List<Integer>>list=new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] v = new int[n+1];
        List<Integer> t = new ArrayList<>();
        Dfs(n, k, v, t);
        for(int i=0;i<list.size();i++)
        {
            for(int j=0;j<list.get(i).size();j++)
            {
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static void Dfs(int n,int k,int[] v,List<Integer> tIntegers)
    {
        if(list.size()==k)
        {
            list.add(new ArrayList<>(tIntegers));
            return;
        }
        for(int i=1;i<=n;i++)
        {
            if(v[i]==1)
            {
                continue;
            }
            v[i]=1;
            tIntegers.add(i);
            Dfs(n, k, v, tIntegers);
            v[i]=0;
            tIntegers.remove(tIntegers.size()-1);
        }
    }
}
