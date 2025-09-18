package test7.Findstatic.dss;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
         String s = ArrayUtil.getArray(arr);
         System.out.println(s);
        double[] arr1 = {1,2,3,4,5,6};
        double age =ArrayUtil.getAge(arr1);
        System.out.println(age);
    }
}
