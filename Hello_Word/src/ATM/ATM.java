package ATM;

import java.util.Scanner;

public class ATM {
    //输入函数声明
    static Scanner scan = new Scanner(System.in);
    //创建一个ATMDemo对象
    static ATMDemo atm = new ATMDemo();
    //登陆界面设计
    public static void Meno()
    {

        while(true)
        {
            System.out.println("==========欢迎进入ATM银行管理系统==========");
            System.out.println("请输入用户名：");
            String username = scan.next();
            System.out.println("请输入密码：");
            String password = scan.next();
            //判断用户名与密码是否一致
            if(username.equals(atm.getUsername()) && password.equals(atm.getPassword()))
            {
                System.out.println("登陆成功！！！");
                selectMoney();
            }
            else {
                System.out.println("用户名或密码输入错误请重新输入！！！");
                continue;
            }
        }

    }
    //登录成功后的主界面
    public static void selectMoney()
    {
        while (true)
        {
            System.out.println("尊敬的用户您好：");
            System.out.println("请选择您要办理的业务: 1.取钱 2.存钱 3.查询余额 4.转账 5.修改密码 6.重新登录 7.退出登录");
            int n = scan.nextInt();
            //创建分支，选择每一项的功能
            switch (n)
            {
                case 1:{
                    gettheMoney();
                    break;
                }
                case 2:{
                    settheMoney();
                    break;
                }
                case 3:{
                    chaMoney();
                    break;
                }
                case 4:{
                    zhuanMoney();
                    break;
                }
                case 5:{
                    changePassword();
                    break;
                }
                case 6:{
                    System.out.println("请重新登录！");
                    Meno();
                    break;
                }
                case 7:{
                    System.out.println("退出登陆！！！");
                    //关闭java虚拟机
                    System.exit(0);
                }
                default:{
                    System.out.println("选择错误，请重新选择！");
                    continue;
                }
        }

        }

    }
    //取钱业务
    public static void gettheMoney()
    {
        System.out.println("请输入要取的钱数:");
        double money = scan.nextDouble();
        if(money<=atm.getMoney())
        {
            System.out.println("取钱成功！！");
            double shengMoney =  atm.getMoney()-money;
            //重新将现在的钱数存入ATMDemo当中
            atm.setMoney(shengMoney);
        }
        else {
            System.out.println("所选数值较大，请重新输入钱数！！！");
            gettheMoney();
        }
    }

    //存钱业务
    public static  void settheMoney()
    {
        System.out.println("请输入要存的钱数:");
        double money = scan.nextDouble();
        System.out.println("存钱成功");
        double shengMoney = atm.getMoney()+money;
        //重新将现在的钱数存入ATMDemo当中
        atm.setMoney(shengMoney);
    }
    //查询余额
    public static void chaMoney()
    {
        System.out.println("您的余额还剩"+" 人民币："+atm.getMoney()+"元");
    }

    //转钱
    public static  void zhuanMoney()
    {
        System.out.println("请输入要转的钱数:");
        double money = scan.nextDouble();
        if(money<=atm.getMoney())
        {
            System.out.println("转钱成功！！");
            double shengMoney =  atm.getMoney()-money;
            //重新将现在的钱数存入ATMDemo当中
            atm.setMoney(shengMoney);
        }
        else {
            System.out.println("所选数值较大，请重新输入钱数！！！");
            gettheMoney();
        }
    }

    //修改密码
    public static  void changePassword()
    {
        System.out.println("请输入您原来的密码：");
        String password = scan.next();
        //判断是否一致
        if(password.equals(atm.getPassword()))
        {
            System.out.println("请输入新密码：");
            String newpassword = scan.next();
            System.out.println("请再次输入一下密码：");
            String againnewpassword = scan.next();
            //判断两次输入的密码是否一致！
            if(newpassword.equals(againnewpassword))
            {
                System.out.println("修改成功！！！");
                atm.setPassword(newpassword);
            }
            else{
                System.out.println("两次密码不一致请重新输入！！！");
                changePassword();
            }
        }
        else{
            System.out.println("修改错误请重新输入密码！！！");
            changePassword();
        }
    }
}
