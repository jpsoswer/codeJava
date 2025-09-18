package test20;
public class a {
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i <= 2020; i++) {
                String string = i+"";
                for(int j=0;j<string.length();j++)
                {
                    char ch = string.charAt(j);
                    int n = ch-'0';
                    if(n==2)
                    {
                        count++;
                    }
                }
        }
        System.out.println(count);
    }
}
