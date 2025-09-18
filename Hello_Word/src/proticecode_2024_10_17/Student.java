package proticecode_2024_10_17;

//许家乐的java程序
import java.util.Scanner ;
public class Student {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("欢迎进入选择界面");
        System.out.println("请输入想要查看的信息所对应的数字 1.单个职工工资计算  2.多个职工工资计算  3.退出");
        int a = myScanner.nextInt();
        int b,c,d,e,sum = 0;
        String name,sex;
        label:
        while (true) {
            if(a==1) {
                System.out.println("请输入员工姓名");
                name = myScanner.next();
                System.out.println("请输入员工性别");
                sex = myScanner.next();
                System.out.println("姓名"+name+" "+"性别"+sex);
                System.out.println("请输入基本工资");
                b = myScanner.nextInt();
                System.out.println("请输入津贴");
                c = myScanner.nextInt();
                System.out.println("请输入奖金");
                d = myScanner.nextInt();
                sum=b+c+d;
                System.out.println("工资为"+sum);
                break label;
            }
            if(a==2) {
//           ####
            }
            if(a==3) {
                break label;
            }
            if(a!=1 || a!=2 || a!=3) {
                System.out.println("请输入数字1-3");
                e = myScanner.nextInt();
                a = e;
            }
        }
    }
}