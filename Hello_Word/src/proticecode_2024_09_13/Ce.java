package proticecode_2024_09_13;

public class Ce {
    public static void main(String[] args) {
        int[] arr = {2,1,6,23,12,5,67,45};
        int d = 0;
        for(int i = 1;i<arr.length;i++)
        {
            for(int j = i-1;j>=0;j--)
            {
                if(arr[i] < arr[j])
                {
                    d= arr[i];
                    arr[i] = arr[j];
                    arr[j] = d;
                }
            }
        }
        for(int i =0 ;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
