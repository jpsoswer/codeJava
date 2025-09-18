package test7.Findstatic.a05;

public class Employee {
    private String id;
    private String name;
    private double workerMoney;

    public Employee() {
    }

    public Employee(String id, String name, double workerMoney) {
        this.id = id;
        this.name = name;
        this.workerMoney = workerMoney;
    }
    //工作方法
    public void work()
    {
        System.out.println("正在工作");
    }
    //吃饭
    public void eat()
    {
        System.out.println("吃米饭");
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWorkerMoney() {
        return workerMoney;
    }

    public void setWorkerMoney(double workerMoney) {
        this.workerMoney = workerMoney;
    }
}
