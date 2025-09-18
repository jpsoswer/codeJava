package udpNetTest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class updatefaDemo2 {
    public static void main(String[] args) throws IOException {
        //创建ds对象
        DatagramSocket ds = new DatagramSocket(10086);

        //创建字节数组
        byte[] bytes = new byte[1024];

        //创建数据包
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

        while (true) {
            //接受数据阻塞区
            ds.receive(dp);
            byte[] data = dp.getData();
            InetAddress address = dp.getAddress();
            int port = dp.getPort();
            System.out.println(address.getHostAddress()+"向"+port+"端口发送了"+new String(data,0,dp.getLength()));
        }


    }
}
