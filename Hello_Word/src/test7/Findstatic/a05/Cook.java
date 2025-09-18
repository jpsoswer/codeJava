package test7.Findstatic.a05;

public class Cook extends Employee{
    public Cook() {
    }

    public Cook(String id, String name, double workerMoney) {
        super(id, name, workerMoney);
    }
    @Override
    public void work()
    {
        System.out.println("炒菜");
    }
}
