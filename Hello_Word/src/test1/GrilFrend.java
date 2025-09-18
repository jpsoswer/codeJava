package test1;

public class GrilFrend {
    private String name;
    private int age;
    private double high;
    private String habily;
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int n)
    {
        if(n >= 18&&n <= 50)
        {
            age = n;
        }
        else{
            System.out.println("数据异常");
        }
    }
    public int getAge()
    {
        return age;
    }
    public void setHigh(double hi)
    {
        high = hi;
    }
    public double getHigh()
    {
        return high;
    }
    public void Sleep()
    {
        System.out.println("正在睡觉");
    }
    public void Guangjie()
    {
        System.out.println("正在逛街");
    }
    public void eat()
    {
        System.out.println("正在吃饭");
    }

}
