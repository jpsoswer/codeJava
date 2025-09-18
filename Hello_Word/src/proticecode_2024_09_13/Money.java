package proticecode_2024_09_13;

public class Money {
    public int[] getmoney(int[] money)                      //将数组中的每一个元素初始化
    {
       for(int i=0;i<money.length;i++)
       {
           money[i] = 100;
       }
        return money;
    }
    public void Moneybian(int n,int[] money)                //求变化之后各个元素的值
    {
        for(int i=0;i<n;i++)
        {
            for(int j = 0;j<money.length;j++)
            {
                if(money[j] != 0)
                {
                    int suiji = money[j];
                    do {
                        suiji = (int) (Math.random() * 100);
                    } while (suiji == money[j]);
                    money[j]--;
                    money[suiji]++;
                }
            }
        }

    }
    public int Sumcha(int[] money)                //求每个元素与所有元素的差值的绝对值的和
    {
        int sum = 0;
        int t = 0;
        for(int i=0;i<money.length;i++)
        {
            for(int j=0;j<money.length;j++)
            {
                t=Math.abs(money[i]-money[j]);
                sum+=t;
            }
        }
        return sum;
    }
    public double lv(int chasum,int penger)           //求社会的基尼系数
    {
        double lv =0.0;
        lv = (double)chasum/(2*penger*10000);
        return lv;
    }
    public static void main(String[] args) {
        System.out.println("一开始有100个人，每个人都有100元");
        System.out.println("在每一轮都做如下的事情：");
        System.out.println("每个人都必须拿出一元钱给自己以外的其他人，给谁完全随机");
        System.out.println("如果某个人在这一轮的钱数为0，那么他可以不给，但是可以接受");
        System.out.println("发生很多很多轮之后，这些人的财富还会均匀吗？");
        System.out.println("测试开始:");
        Money stu = new Money();
        int penger = 100;
        int lunsex = 10000000;
        int chasum = 0;
        double lv = 0.0;
        int[] money = new int[100];
        money = stu.getmoney(money);
        stu.Moneybian(lunsex,money);
        chasum=stu.Sumcha(money);
        lv = stu.lv(chasum,penger);
        int a=0;
        java.util.Arrays.sort(money);
        System.out.println("每个人的资产从贫穷到富有排序：");
        for(int i=0;i<100;i++)
        {
            a++;
            if(a%10 == 0)
                System.out.println();
            System.out.print(money[i] + "  ");
        }
        System.out.println();
        System.out.println(lv);
    }
}
