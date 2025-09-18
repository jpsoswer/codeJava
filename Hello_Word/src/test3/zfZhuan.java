package test3;

public class zfZhuan {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "cdeab";
        //boolean check = check(strA,strB);
        int number = check(strA,strB);
        System.out.println(number);

    }
    public static String zhuan(String strA)
    {
        String sum;
        String zhuan = "",zhuanone = "";
        zhuan = strA.substring(0,1);
        zhuanone = strA.substring(1);
        sum=zhuanone + zhuan;
        return sum;
    }
    public static int check(String strA,String strB)
    {
        int count = 0;
        for(int i=0;i<strA.length();i++)
        {
            strA = zhuan(strA);
            count++;
            if(strA.equals(strB))
            {
                return count;
            }

        }
        return -1;
    }
}
