package StringDemo;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8,10,12};
        String s =Jihe(arr);
        System.out.println(s);
    }
    public static String Jihe(int[] arr)
    {
        String s = "[";
        for(int i=0;i< arr.length;i++)
        {
            if(i == arr.length-1)
            {
                s+=arr[i];
            }
            else{
                s+=arr[i]+" ,";
            }
        }
        s+="]";
        return s;
    }
}
