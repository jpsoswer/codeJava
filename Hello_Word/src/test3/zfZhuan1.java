package test3;

public class zfZhuan1 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "cdeab";
        //boolean check = check(strA,strB);
        int number = check(strA,strB);
        System.out.println(number);

    }
    public static String zhuan(String strA)
    {
        char[] arr = strA.toCharArray();
        char fist = arr[0];
        for(int i=1;i<strA.length();i++)
        {
            arr[i-1] = arr[i];
        }
        arr[strA.length()-1] = fist;
        String s = new String(arr);
        return s;
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
