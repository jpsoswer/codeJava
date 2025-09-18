package test12;
import java.util.*;
public class B {
    public static void main(String[] args) {
        Btest b1 = new Btest("xiaoshishi",18,163);
        Btest b2 = new Btest("xiaojiaojiao",19,165);
        Btest b3 = new Btest("xiaohuihui",19,170);
        Btest b4 = new Btest("aiaohuihui",19,170);
        Btest[] arr = new Btest[4];
        arr[0] = b1;
        arr[1] = b2;
        arr[2] = b3;
        arr[3] = b4;
        Arrays.sort(arr, new Comparator<Btest>() {
            @Override
            public int compare(Btest o1, Btest o2) {
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHight()-o2.getHight():temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()):temp;
                if(temp > 0)
                {
                    return 1;
                } else if (temp < 0) {
                    return -1;
                }
                else{
                    return 0;
                }
            }
        });
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("姓名：" + arr[i].getName() + "  年龄："+ arr[i].getAge() + "  身高：" + arr[i].getHight() + "    ");
        }
    }
}
