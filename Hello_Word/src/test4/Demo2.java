package test4;

import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {
        String[] yanzheng = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P",
                "Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e",
                "f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u",
                "v","w","x","y","z"};
        String[] shuzima = {"0","1","2","3","4","5","6","7","8","9"};
        String s="";
        for(int i=0;i<3;i++)             //随机生成字符串验证码
        {
            Random sui = new Random();
            int index = sui.nextInt(yanzheng.length);
            s+=yanzheng[index];
        }
        //随机生成数字验证码开始
        Random suishu = new Random();
        int shu = suishu.nextInt(shuzima.length);
        //随机生成验证码结束
        String shu1 = shuzima[shu];
        //再次生成随机数，看看数字要插入的位置

        Random suishu1 = new Random();
        int shu2 = suishu.nextInt(3);

        System.out.println(s);
    }
}
