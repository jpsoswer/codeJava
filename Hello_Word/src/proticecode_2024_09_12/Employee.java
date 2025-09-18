package proticecode_2024_09_12;

public class Employee {
    private String sex;
    private String name;
    private int page = 0;
    private double up = 0;
    public Employee(String sex,String name,int page,double up)
    {
        this.sex = sex;
        this.name = name;
        this.page = page;
        this.up = up;
    }
    public String getsex()
    {
        return sex;
    }
    public String getname()
    {
        return name;
    }
    public int getpage()
    {
        return page;
    }
    public double reduce_su()
    {
        double x = page*up;
        return x;
    }
    public double sum()
    {
        double x = page+(page*up);
        return x;
    }
    public static void main(String[] args) {
        Employee emlist = new Employee("213472","张三",10000,0.234);
        System.out.println("学号为：" + emlist.getsex() + "  姓名为：" + emlist.getname() + "  基本工资为：" + emlist.getpage() + "  工资增长额为："
        + emlist.reduce_su() + "  总工资为:" + emlist.sum());
    }
}
