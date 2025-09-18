package test09;

import java.util.ArrayList;
import java.util.Scanner;

public class dfsNumberSumB {
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        //判断数据状态数组
        int[] v = new int[n+1];
        //开一个集合用来存储一组数据
        ArrayList<Integer> arrList = new ArrayList<>();
        //开始dfs()
        dfs(n,k,v,arrList);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    public static void dfs(int n,int k,int[] v,ArrayList<Integer> arrayList)
    {
        if(arrayList.size() == k)
        {
            list.add(new ArrayList<>(arrayList));
            return;
        }

        for (int i = 1; i <= n; i++) {
            if(v[i]==1)
            {
                continue;
            }
            v[i]=1;
            arrayList.add(i);
            dfs(n,k,v,arrayList);
            v[i]=0;
            arrayList.remove(arrayList.size()-1);
        }
    }
}
