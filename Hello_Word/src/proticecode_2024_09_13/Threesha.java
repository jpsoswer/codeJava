package proticecode_2024_09_13;

public class Threesha {
    public void Choose(int[] arr)
    {
        int t = 0;
        if(arr.length > 2) {
            for (int i = 0; i < arr.length; i++)
            {
                for (int j = i + 1; j < arr.length; j++)
                {
                    if(arr[i] > arr[j])
                    {
                        t = arr[i];
                        arr[i] = arr[j];
                        arr[j] = t;
                    }
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public void Maopao(int[] arr)
    {
        int t = 0;
        for(int end = arr.length-1;end > 0;end--)
        {
            for(int j = end-1;j >= 0;j--)
            {
                if(arr[j] > arr[end])
                {
                    t = arr[end];
                    arr[end] = arr[j];
                    arr[j] = t;
                }
            }
        }
        for(int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public void Cha(int[] arr)
    {
        int d = 0;
        for(int i = arr.length-1;i>0;i--)
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
    public static void main(String[] args) {
        int[] arr = {2,1,6,23,12,5,67,45};
        Threesha su = new Threesha();
        //su.Choose(arr);
        //su.Maopao(arr);
        su.Cha(arr);
    }
}
