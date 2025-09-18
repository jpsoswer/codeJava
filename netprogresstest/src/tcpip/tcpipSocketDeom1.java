package tcpip;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class tcpipSocketDeom1 {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        //参数指定ip地址与端口号
        Socket sk = new Socket("127.0.0.1",10086);

        //获取字节输出流的对象输出数据
        OutputStream outputStream = sk.getOutputStream();

        outputStream.write("张三".getBytes());

        //关流
        outputStream.close();
        //关闭客户端
        sk.close();
    }
}
