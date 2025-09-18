package test2;

import java.util.Random;

public class Pk {
    private String name;
    private int sumxue;
    public Pk()
    {

    }
    public Pk(String name,int sumxue)
    {
        this.name = name;
        this.sumxue = sumxue;
    }
    public String getName()
    {
        return name;
    }
    public int getSumxue()
    {
        return sumxue;
    }
    public void pkXue(Pk aida)
    {
        Random su = new Random();
        int suiji = su.nextInt(20)+1;
        aida.sumxue = aida.sumxue -suiji;
        int sheng = aida.sumxue;
        if(sheng < 0)
        {
            aida.sumxue = 0;
        }
        System.out.println(this.name + "打了" + aida.name + "一拳，造成了" + suiji + "点伤害," + aida.name +"还剩" + aida.sumxue + "点伤害");
    }
}
