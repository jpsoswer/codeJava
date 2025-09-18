package proticecode_2024_09_13;

public class TwoFeng {
    public static int Secotion(int[] nums)
    {
        int n = nums.length;
        if(n == 1)
        {
            return 0;
        }
        if(nums[0] >nums[1] )
        {
            return 0;
        }
        if(nums[n-1] > nums[n-2])
        {
            return n-1;
        }
        int l = 1;
        int r = n-2;
        while(l <= r)
        {
            int m = l+(r-l)/2;
            if(nums[m-1] > nums[m])
            {
                r = m-1;
            }
            else if(nums[m+1] > nums[m])
            {
                l = m+1;
            }
            else
            {
                return m;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,5,3,7,6,5,4};
        int a = Secotion(nums);
        System.out.println(a);
    }
}
