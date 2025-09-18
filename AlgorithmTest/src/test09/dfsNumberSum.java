package test09;

import java.util.ArrayList;
import java.util.Scanner;

public class dfsNumberSum {
    //创建一个队列用来存储队列
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arrlist = new ArrayList<>();
        int[] v =new int[n+1];
        dfs(n,arrlist,v);

        for (int i = 0; i < list.size(); i++) {
            for (int i1 = 0; i1 < list.get(i).size(); i1++) {
                System.out.print("    "+list.get(i).get(i1));
            }
            System.out.println();
        }
    }

    public static void dfs(int n,ArrayList<Integer> arrlist,int[] v)
    {
        //结束条件
        if(arrlist.size()==n)
        {
            list.add(new ArrayList<>(arrlist));
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (v[i]==1)
            {
                continue;
            }
            v[i]=1;
            arrlist.add(i);
            dfs(n,arrlist,v);
            v[i]=0;
            arrlist.remove(arrlist.size()-1);
        }

    }
}
