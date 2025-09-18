package test25;

import java.util.Scanner;

public class dfsmigong {
    //用来存放迷宫元素
    static int[][] arr = new int[100][100];
    //用来查看元素是否用了
    static int[][] v = new int[100][100];
    //定义起点，终点
    static  int strx,stry,p,q;
    //定义最小值，与步数进行比较
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        //输入函数
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= m; j++) {
                arr[i][j]=scan.nextInt();
            }
        }
        strx=scan.nextInt();
        stry=scan.nextInt();
        p=scan.nextInt();
        q=scan.nextInt();
        v[strx][stry]=1;
        dfs(strx,stry,0);
        System.out.println(min);
    }
    //定义dfs函数
    public static void dfs(int x,int y,int stup)
    {
        if(x==p && y==q)
        {
            if(stup<min)
            {
                min = stup;
            }
            return;
        }
        //先右
        if(arr[x][y+1] == 1 && v[x][y+1]==0)
        {
            v[x][y+1]=1;
            dfs(x,y+1,stup+1);
            v[x][y+1]=0;
        }
        //再下
        if(arr[x+1][y]==1 && v[x+1][y]==0)
        {
            v[x+1][y]=1;
            dfs(x+1,y,stup+1);
            v[x+1][y]=0;
        }
        //再左
        if(arr[x][y-1] == 1 && v[x][y-1]==0)
        {
            v[x][y-1]=1;
            dfs(x,y-1,stup+1);
            v[x][y-1]=0;
        }
        //再上
        if(arr[x-1][y]==1 && v[x-1][y]==0)
        {
            v[x-1][y]=1;
            dfs(x-1,y,stup+1);
            v[x-1][y]=0;
        }
        return;
    }
}
