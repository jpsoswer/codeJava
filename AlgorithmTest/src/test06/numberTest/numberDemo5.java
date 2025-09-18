package test06.numberTest;

import java.util.Scanner;

//x
//6
// −2∗x
//5
// +3∗x
//4
// −5∗x
//2
// +6∗x+7
public class numberDemo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println((int)(Math.pow(x,6)-2*Math.pow(x,5)+3*Math.pow(x,4)-5*Math.pow(x,2)+6*x+7));
    }
}
