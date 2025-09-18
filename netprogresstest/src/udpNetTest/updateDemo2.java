package udpNetTest;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class updateDemo2 {
    public static void main(String[] args) throws IOException {
        //创建ds对象
        DatagramSocket ds = new DatagramSocket();
        //创建发送端的ip
        InetAddress byName = InetAddress.getByName("127.0.0.1");
        int post = 10086;
        //输入数据
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的数据：");
            String shujv = scanner.next();
            //结束聊天条件
            if (shujv.equals("001"))
            {
                break;
            }
            byte[] bytes = shujv.getBytes();

            //打包数据
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,byName,post);

            //发送数据
            ds.send(dp);
        }

        //释放资源
        ds.close();
    }
}
