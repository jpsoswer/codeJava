package test25;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfsmigong {
    static int[][] arr = new int[100][100];
    static int[][] v = new int[100][100];
    static int strx,stry,p,q;
    //声明一个数组用来存放四个方向的数值
    static int[] fx={0,1,0,-1};
    static int[] fy={1,0,-1,0};

    //定义一个类来表示三个参数
    static class listthree{
        private int x;
        private int y;
        private int stup;
        public listthree() {
        }

        public listthree(int x, int y, int stup) {
            this.x = x;
            this.y = y;
            this.stup = stup;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getStup() {
            return stup;
        }

        public void setStup(int stup) {
            this.stup = stup;
        }

        @Override
        public String toString() {
            return "listthree{" +
                    "x=" + x +
                    ", y=" + y +
                    ", stup=" + stup +
                    '}';
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<listthree> qulink= new LinkedList<>();
        int n = scan.nextInt();
        int m = scan.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= m ; j++) {
                arr[i][j]=scan.nextInt();
            }
        }
        strx = scan.nextInt();
        stry = scan.nextInt();
        p = scan.nextInt();
        q = scan.nextInt();
        listthree lt1 = new listthree(strx,stry,0);
        qulink.add(lt1);
        v[strx][stry]=1;
        while(!qulink.isEmpty())
        {
            if(qulink.peek().x == p && qulink.peek().y == q)
            {
                System.out.println(qulink.peek().stup);
                break;
            }
            //进行四个方向走
            for (int i = 0; i <=3 ; i++) {
                listthree lt = new listthree();
                int x = qulink.peek().x;
                int y = qulink.peek().y;
                int dx = x+fx[i];
                int dy = y+fy[i];
                if(arr[dx][dy] == 1 && v[dx][dy] == 0)
                {
                    lt.x = dx;
                    lt.y = dy;
                    lt.stup = qulink.peek().stup+1;
                    qulink.add(lt);
                    v[dx][dy] = 1;
                }
            }
            qulink.poll();
        }
    }
}
