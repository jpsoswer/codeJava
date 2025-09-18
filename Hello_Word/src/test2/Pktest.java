package test2;

public class Pktest {
    public static void main(String[] args) {
        Pk p1 = new Pk("皮卡丘",100);
        Pk p2 = new Pk("超梦",100);
        while(true)
        {
            p1.pkXue(p2);
            if(p2.getSumxue() == 0)
            {
                System.out.println("皮卡丘获胜");
                break;
            }
            p2.pkXue(p1);
            if(p1.getSumxue() == 0)
            {
                System.out.println("超梦获胜");
                break;
            }
        }
    }
}
