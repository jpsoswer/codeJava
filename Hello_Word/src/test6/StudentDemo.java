package test6;
//基础型学生管理系统制作

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    public void Student() {
        ArrayList<Student> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        //用常量写是代码更具可读性
        final String ADD_STUDENT = "1";
        final String REMOVE_STUDENT = "2";
        final String CHANGE_STUDENT = "3";
        final String GET_STUDENT = "4";
        final String EXIT_STUDENT = "5";
        leen:while(true)
        {
            System.out.println("------------欢迎来到学生管理系统------------");
            System.out.println("1: 添加学生");
            System.out.println("2: 删除学生");
            System.out.println("3: 修改学生");
            System.out.println("4: 查询学生");
            System.out.println("5: 退出!");
            System.out.println("请输入你的选择：");
            String s = in.next();
            switch(s)
            {
                case ADD_STUDENT: addStudent(list); break;
                case REMOVE_STUDENT:
                {
                    System.out.println("请输入所要删除数据的id");
                    String id = in.next();
                    removeStudent(list,id);
                } break;
                case CHANGE_STUDENT: {
                    System.out.println("请输入所要修改数据的id");
                    String id = in.next();
                    xiugaiStudent(list,id);
                } break;
                case GET_STUDENT: getStudent(list); break;
                case EXIT_STUDENT: {
                    System.out.println("退出成功！");
                    break leen;
                }
                default: System.out.println("没有这个选项，请重新输入！"); break;
            }
        }
    }
    public static void addStudent(ArrayList<Student> list)                   //添加学生数据
    {
        Student s = new Student();
        Scanner ad = new Scanner(System.in);
        System.out.println("请输入id：");
        String id = ad.next();
        s.setId(id);                                  //将输入的数据交给Student类
        System.out.println("请输入姓名：");
        String name = ad.next();
        s.setName(name);
        System.out.println("请输入年龄：");
        int age = ad.nextInt();
        s.setAge(age);
        System.out.println("请输入家庭地址：");
        String addess = ad.next();
        s.setAddress(addess);
        if(requeueBlean(list,id))
        {
            list.add(s);
            System.out.println("添加成功");
        }
        else{
            System.out.println("id重复请重新输入!");
        }
    }
    public static void removeStudent(ArrayList<Student> list , String id)           //删除数据
    {
        int index = requeueInt(list,id);
        if(index >= 0)
        {
            list.remove(index);
            System.out.println("删除成功！");
        }
        else{
            System.out.println("没有这个数据无法删除，请重新输入");
        }
    }

    public static void xiugaiStudent(ArrayList<Student> list, String id)             //修改数据
    {
        int index = requeueInt(list,id);
        if(index >= 0)
        {
            Student s = new Student();
            Scanner ad = new Scanner(System.in);
            s.setId(id);//将输入的数据交给Student类
            System.out.println("请输入新姓名：");
            String newname = ad.next();
            s.setName(newname);
            System.out.println("请输入新年龄：");
            int newage = ad.nextInt();
            s.setAge(newage);
            System.out.println("请输入新家庭地址：");
            String newaddess = ad.next();
            s.setAddress(newaddess);
            list.set(index,s);
            System.out.println("修改成功！");
        }
        else{
            System.out.println("没有这个数据无法修改，请重新输入");
        }
    }

    public static void getStudent(ArrayList<Student> list)                  //显示学生信息
    {
        if (list.size() == 0)
        {
            System.out.println("当前信息为空请添加信息后再查看！");
        }
        else
        {
            System.out.println("id\t\t姓名\t\t年龄\t\t家庭住址\t\t");
            for(int i=0;i<list.size();i++)
            {
                System.out.println(list.get(i).getId() + "\t" + list.get(i).getName() + "\t" + list.get(i).getAge() + "\t" +
                        list.get(i).getAddress() + "\t");
            }
        }

    }
    public static boolean requeueBlean(ArrayList<Student> list, String id)                   //判断id有没有重复
    {
        return requeueInt(list,id) < 0;
    }
    public static int requeueInt(ArrayList<Student> list, String id)                        //返回所找数的索引
    {
        for(int i=0;i<list.size();i++)
        {
            if(id.equals(list.get(i).getId()))
            {
                return i;
            }
        }
        return -1;
    }
}
