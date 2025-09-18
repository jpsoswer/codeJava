package test5;

public class Demo1 {
    public static void main(String[] args) {
        int l = 2019;
        int r = 324;
        int count=0;
        while(true)
        {
            int ban = l-r;
            if(ban>=r)
            {
                l = ban;
            }
            else{
                l = r;
                r = ban;
            }
            count++;
            if(l == r)
            {
                break;
            }
        }
        System.out.println(count +1 +"个正方形");

    }
}
