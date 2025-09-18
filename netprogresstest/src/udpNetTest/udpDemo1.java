package udpNetTest;

import java.io.IOException;
import java.net.*;

public class udpDemo1 {
    public static void main(String[] args) throws IOException {
        //创建ds对象
        MulticastSocket ms = new MulticastSocket();
        String shujv = "你好！！";
        byte[] bytes = shujv.getBytes();
        InetAddress name = InetAddress.getByName("224.0.0.2");

        //打包数据
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,name,10086);

        //发送数据
        ms.send(dp);

        //释放资源
        ms.close();
    }
}
