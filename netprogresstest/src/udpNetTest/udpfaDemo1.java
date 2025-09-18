package udpNetTest;

import java.io.IOException;
import java.net.*;

public class udpfaDemo1 {
    public static void main(String[] args) throws IOException {
        //创建Ds对象
        //接收方指定的端口要与发送端指定的端口保持一致
        MulticastSocket ms = new MulticastSocket(10086);

        //创建数据包来接受数据
        //创建字节数组
        InetAddress byName = InetAddress.getByName("224.0.0.2");
        ms.joinGroup(byName);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        //该命令阻塞
        //会死等发送端发送的数据，用以接收
        ms.receive(dp);
        System.out.println(new String(dp.getData(),0,dp.getLength()));
        System.out.println("本机向"+dp.getAddress()+"的"+dp.getPort()+"端口发送了数据");
        //释放资源
        ms.close();
    }
}
