package test09;

import java.util.Scanner;

public class DFS {
    static int[][] arr=new int[100][100];
    //定义终点
    static int zx=0,zy=0;
    //表示访问状态
    static int[][] v = new int[100][100];
    //定义一个绝对大的数
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        //给图创建初始值，1表示正常可以走，2表示有障碍物
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        //定义起点
        int dx = scan.nextInt();
        int dy = scan.nextInt();
        zx = scan.nextInt();
        zy = scan.nextInt();

        int stup=0;
        v[dx][dy]=1;
        dfs(dx,dy,stup);

        System.out.println(min);

    }

    public static void dfs(int x,int y,int stup)
    {
        //判断退出条件
        if(x==zx && y==zy)
        {
            min = Math.min(min, stup);
            return;
        }

        //向右移动
        if(arr[x][y+1]==1&&v[x][y+1]==0)
        {
            v[x][y+1]=1;
            dfs(x,y+1,stup+1);
            v[x][y+1]=0;
        }
        //向下移动
        if(arr[x+1][y]==1 && v[x+1][y]==0)
        {
            v[x+1][y]=1;
            dfs(x+1,y,stup+1);
            v[x+1][y]=0;
        }
        //向左移动
        if(arr[x][y-1]==1&&v[x][y-1]==0)
        {
            v[x][y-1]=1;
            dfs(x,y-1,stup+1);
            v[x][y-1]=0;
        }
        //向上移动
        if(arr[x-1][y]==1 && v[x-1][y]==0)
        {
            v[x-1][y]=1;
            dfs(x-1,y,stup+1);
            v[x-1][y]=0;
        }
        //回溯
        return;
    }
}
