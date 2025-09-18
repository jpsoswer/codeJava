package test6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Usertext {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        leep:while(true)
        {
            System.out.println("------------欢迎来到学生管理系统------------");
            System.out.println("请输入你要执行的操作：");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.忘记密码");
            System.out.println("4.退出！");
            String choose = sc.next();
            switch(choose)
            {
                case "1": DengLu(list);
                break;
                case "2": ZhuCe(list);
                break;
                case "3": changePasswd(list);
                break;
                case "4": {
                    System.out.println("感谢你使用此系统！");
                    break leep;
                }
                default: System.out.println("选择错误，请重新选择！");
            }



        }

    }
    //验证注册开始-----------------------------------------
    public static void ZhuCe(ArrayList<User> list)
    {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        int sum = 0;
        while(true)
        {
            System.out.println("请输入用户名：");
            String username = sc.next();
            //判断用户名是否符合规则

            if( contains(list,username) && ((username.length() >= 3 && username.length() <= 15)) && zimujiashuzi(username))
            {
                user.setUsername(username);
                sum++;
            }
            else
            {
                System.out.println("用户名格式错误请重新输入！");
                continue;
            }
            //判断密码是否符合规则
            System.out.println("请输入密码：");
            String passwd = sc.next();
            System.out.println("请再次输入密码：");
            String passwd1 = sc.next();
            if(passwd.equals(passwd1))
            {
                user.setUserpasswd(passwd);
                sum++;
            }
            else{
                System.out.println("两次密码输入不一致，请重新输入！");
                continue;
            }
            //开始验证身份证号，长度18位，不能以0开头，前17必须是数字，最后一位可以是X或x或数字
            System.out.println("请输入身份证号：");
            String shenfennumber = sc.next();
            if(shenfennumber.length() == 18 && shenfennumber.charAt(0) != '0' && checkpersonID(shenfennumber))
            {
                user.setShenfennumber(shenfennumber);
                sum++;
            }
            else{
                System.out.println("身份证号" + shenfennumber + "格式错误请重新输入!");
                continue;
            }
            if(sum == 3)
            {
                list.add(user);
                break;
            }
        }
        //打印整个集合
        for(int i = 0;i<list.size();i++)
        {
            System.out.println(list.get(i).getUsername() + ", " + list.get(i).getUserpasswd() +
                    ", " + list.get(i).getShenfennumber());
        }
    }
    public static boolean contains(ArrayList<User> list,String username)           //判断有无重复
    {
        return getindex(list,username) < 0;
    }
    public static int getindex(ArrayList<User> list,String username)                  //返回所要找的数的索引
    {
        for(int i = 0;i<list.size();i++)
        {
            if(username.equals(list.get(i).getUsername()))
            {
                return i;
            }
        }
        return -1;
    }

    //判断用户名，只能是字母加数字，不能是纯字母
    public static boolean zimujiashuzi(String username)
    {
        //判别是不是字母加数字
        for(int i=0;i<username.length();i++)
        {
            if(!( (username.charAt(i) >= 'A' && username.charAt(i) <= 'Z') || (username.charAt(i) >= 'a' && username.charAt(i) <= 'z')
            ||( username.charAt(i) >= '0' && username.charAt(i) <= '9') ))
            {
              return false;
            }
        }
        //判别是不是只有数字
        for(int i=0;i<username.length();i++)
        {
            if(( (username.charAt(i) >= 'a' && username.charAt(i) <='z') || (username.charAt(i) <= 'A' && username.charAt(i) >= 'Z')) )
            {

            }
        }
        return true;
    }
    //检查身份证号
    public static boolean checkpersonID(String shenfennumber)
    {
        for(int i=0;i<shenfennumber.length()-1;i++)
        {
            char check = shenfennumber.charAt(i);
            if(!(check >= '0' && check <= '9'))
            {
                return false;
            }
            char checkend = shenfennumber.charAt(shenfennumber.length()-1);
            if(!((checkend >= '0' && checkend <= '9') || checkend == 'x' || checkend == 'X'))
            {
                return false;
            }
        }
        return true;
    }
    //验证注册结束---------------------------------


    //验证登录开始------------------------
    public static void DengLu(ArrayList<User> list)
    {
        Scanner sc = new Scanner(System.in);

        if(!list.isEmpty())
        {
            String yanZheng = "";
            yanZheng = YanZheng();
            System.out.println(yanZheng);
            System.out.println("请输入验证码：");
            String yanZheng1 = sc.next();
            if(yanZheng.equals(yanZheng1))
            {
                for(int i=0;i<3;i++)
                {
                    System.out.println("请输入用户名:");
                    String userName = sc.next();
                    System.out.println("请输入密码：");
                    String userPassword = sc.next();
                    int n = getindex(list,userName);
                    if(n != -1)
                    {
                        if(userPassword.equals(list.get(n).getUserpasswd()))
                        {
                            System.out.println("登陆成功！");
                            StudentDemo stu = new StudentDemo();
                            stu.Student();
                            break;
                        }
                        else {
                            if(i != 2)
                                System.out.println("密码输入错误，请重新输入");
                            else
                                System.out.println("三次机会已经用光，请重新开始登录！");

                        }
                    }
                    else {
                        System.out.println("用户名错误，请重新输入！");
                    }
                }
            }

        }
        else {
            System.out.println("用户名未注册请先注册！");
        }
    }
    //开始随机生成验证码；
    public static String YanZheng()
    {
        String[] yanzheng = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P",
                "Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e",
                "f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u",
                "v","w","x","y","z"};
        String[] shuzima = {"0","1","2","3","4","5","6","7","8","9"};
        String yanNumber = "";
        //随机生成三个字符的验证码
        for(int i=0;i<3;i++)
        {
            Random ra = new Random();
            int index = ra.nextInt(yanzheng.length);
            yanNumber += yanzheng[index];
        }
        //开始随机生成数字
        Random ra = new Random();
        int index = ra.nextInt(shuzima.length);
        yanNumber += shuzima[index];
        char[] arr = yanNumber.toCharArray();
        //随机生成一个位置交换
        int in = ra.nextInt(arr.length-1);
        char t = arr[in];
        arr[in] = arr[arr.length-1];
        arr[arr.length-1] = t;
        String s = new String(arr);
        return s;
    }
    //查看用户名是否一致


    //验证登陆结束------------------------

    //验证修改密码服务开始-------------------
    public static void changePasswd(ArrayList<User> list)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String userName = sc.next();
        int index = getindex(list,userName);
        //判断用户是否存在
        if(index != -1)
        {
             System.out.println("请输入身份证号：");
             String personID = sc.next();
             //判断身份证是否一致
             if(personID.equals(list.get(index).getShenfennumber()))
             {
                 System.out.println("请输入新的密码:");
                 String newPassword = sc.next();
                 System.out.println("请再次输入新的密码:");
                 String newPassword1 = sc.next();
                 if(newPassword1.equals(newPassword))
                 {
                     list.get(index).setUserpasswd(newPassword);
                     System.out.println("修改密码成功！！！");
                 }
                 else {
                     System.out.println("密码修改失败");
                 }
             }
             else {
                 System.out.println("身份证输入错误");
             }

        }
        else
        {
            System.out.println("未注册");
        }
    }
    //验证修改密码服务结束-------------------
}
