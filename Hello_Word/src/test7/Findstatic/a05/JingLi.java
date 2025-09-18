package test7.Findstatic.a05;

public class JingLi extends Employee{
    private double jiangMoney;

    public JingLi() {

    }

    public JingLi(String id, String name, double workerMoney, double jiangMoney) {
        super(id, name, workerMoney);
        this.jiangMoney = jiangMoney;
    }
    @Override
    public void work()
    {
        System.out.println("管理其他人");
    }
    public double getJiangMoney() {
        return jiangMoney;
    }

    public void setJiangMoney(double jiangMoney) {
        this.jiangMoney = jiangMoney;
    }
}
