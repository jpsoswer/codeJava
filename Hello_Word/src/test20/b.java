package test20;

public class b {
    public static void main(String[] args) {
        int[] monthday= {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int[] zishu= {13,1,2,3,5,4,4,2,2,2};
        int ans=0;
        int month = 12;
        for(int i=2000;i<=2024;i++)
        {
            int sum1=0;
            int year=i;
            //计算年
            while(year!=0)
            {
                sum1+=zishu[year%10];
                year/=10;
            }
            if(i==2024)
            {
                month=4;
                monthday[4]=13;
            }
            //计算月

            for(int j=1;j<=month;j++)
            {
                int sum2=0;
                sum2+=zishu[j/10]+zishu[j%10];
                if(i%4==0 && i%100 !=0 || (i%400==0)&&(j==2))
                {
                    monthday[2]=29;
                }
                else {
                    monthday[2]=28;
                }
                //计算日
                int sum3=0;
                for(int k=1;k<=monthday[j];k++)
                {
                    int sum=0;
                    sum+=sum1+sum2+zishu[k/10]+zishu[k%10];
                    if(sum>50)
                    {
                        ans++;
                    }
                }
            }

        }
        System.out.println(ans);
    }
}
