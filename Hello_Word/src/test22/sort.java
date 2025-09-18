package test22;
import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        // arr = quickSort(arr,0,n-1);
        Arrays.sort(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
//     public static int[] quickSort(int[] arr,int left,int right)
//     {
//       if(left < right)
//       {
//         int p = quickfen(arr,left,right);
//         quickSort(arr,left,p-1);
//         quickSort(arr,p+1,right);
//       }
//       return arr;
//     }

//     public static int quickfen(int[] arr,int left,int right)
//     {
//       int p = left;
//       int index = left+1;
//       for (int i = index; i <= right; i++) {
//         if(arr[i] < arr[p])
//         {
//           zhuan(arr,i,index);
//           index++;
//         }
//       }
//       zhuan(arr, p, index-1);
//       return index-1;
//     }

//     public static void zhuan(int[] arr,int a,int b)
//     {
//       int t = arr[a];
//       arr[a] = arr[b];
//       arr[b] = t;
//     }

// }