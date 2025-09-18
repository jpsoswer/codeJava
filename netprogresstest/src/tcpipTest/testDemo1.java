package tcpipTest;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class testDemo1 {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        Socket sk = new Socket("127.0.0.1",10086);
        //创建字符输出流的对象
        OutputStream bw = sk.getOutputStream();
        //创建输入函数
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("请输入你要说的话：");
            String string = scan.nextLine();
            if(string.equals("001"))
            {
                break;
            }
            bw.write(string.getBytes());
            bw.write('\n');
        }

        //关流
        bw.close();
        sk.close();

    }
}
