package test24;
import java.util.Scanner;

public class piaiXv2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n + 1];
        int[] p = new int[m];

        // 输入数组 a
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }

        // 输入数组 p
        for (int i = 0; i < m; i++) {
            p[i] = in.nextInt();
        }

        // 进行多次交换，直到无法再交换为止
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < m; i++) {
                // 检查是否越界
                if (p[i] < n && a[p[i]] > a[p[i] + 1]) {
                    int t = a[p[i]];
                    a[p[i]] = a[p[i] + 1];
                    a[p[i] + 1] = t;
                    swapped = true;
                }
            }
        }

        // 检查数组 a 是否为非降序
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i + 1]) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
        in.close();
    }
}