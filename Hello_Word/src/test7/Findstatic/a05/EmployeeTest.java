package test7.Findstatic.a05;

public class EmployeeTest {
    public static void main(String[] args) {
        JingLi jl = new JingLi("12345","张三",8000.0,5000.0);
        System.out.println(jl.getId() + ", " + jl.getName() + ", "
                + jl.getWorkerMoney() + ", " + jl.getJiangMoney());
        jl.work();
        jl.eat();
        System.out.println("-----------------------");
        Cook ck = new Cook();
        ck.setId("1234");
        ck.setName("李四");
        ck.setWorkerMoney(6000);
        System.out.println(ck.getId()+", "+ck.getName()+", "+ck.getWorkerMoney());
        ck.work();
        ck.eat();
    }
}
