package test20;

public class changeNumber {
    public static void main(String[] args) {
        int sum=change(1,2,3,4,5,6,7,8,9,10);
        System.out.println(sum);
    }
    public static int change(int...a)
    {
        int sum=0;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }
}
