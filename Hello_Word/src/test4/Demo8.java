package test4;
import java.util.Scanner;
public class Demo8 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入初赛成绩：");
        double score = myScanner.nextDouble();
        if (score >= 8.0) {
            System.out.println("恭喜你进入决赛，请输入性别代号为您匹配决赛对手(男1女2):");
            int sex = myScanner.nextInt();
            if (sex == 1 || sex == 2) {
                if (sex == 1) {        //此处用1和2代替男女
                    System.out.println("输入成功，已为您分配男子组，请静待通知");
                } else if (sex == 2) {
                    System.out.println("输入成功，已为您分配女子组，请静待通知");
                }
            } else {
                System.out.println("请输入正确的性别代号");
            }
        } else {
            System.out.println("很抱歉，您未进入决赛");
        }
    }
}