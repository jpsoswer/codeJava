package test3;
//两个字符串先转化为数字在进行相乘
public class Demo3 {
    public static void main(String[] args) {
        String num1 = "1234567";
        String num2 = "1234";
        int sum=0;
        int sum1=0;
        int a=0;
        for(int i=num1.length()-1;i >= 0;i--)
        {
            int shu = num1.charAt(i) - 48;                      //字符-48会得到相应的数字
            sum+= shu*Math.pow(10,a);
            a++;
        }
        a=0;                        //这里如果不初始化a的值将不是0
        for(int i=num2.length()-1;i >= 0;i--)
        {
            int shu = num1.charAt(i) - 48;
            sum1 += shu*Math.pow(10,a);
            a++;
        }

        System.out.println(sum1*sum);                      //求最终的值
    }
}
