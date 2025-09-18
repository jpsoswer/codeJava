package test7.Findstatic.dss;

//以固定格式打印数组
public class ArrayUtil {
    public static  String getArray(int arr[])
    {
        StringBuilder sb =new StringBuilder();
        sb.append("[");
        for (int i = 0; i< arr.length; i++)
        {
            if(i == arr.length -1)
            {
                sb.append(arr[i]).append("]");
            }
            else{
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.toString();
    }

    //求浮点数组的平均值
    public static Double getAge(double arr[])
    {
        double sum = 0;
        for (int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum/arr.length;
    }
}
