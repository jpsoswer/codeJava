package tcpipTest.testDemo4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class testDemo4Server {
    public static void main(String[] args) throws IOException {
        //创建服务端对象
        ServerSocket ss = new ServerSocket(10000);
        //放到循环当中，保持服务端不关闭
        while (true) {
            //创建接受数据
            Socket accept = ss.accept();
            //建立多线程保证数据传输效率
            new Thread(new MyRuntime(accept)).start();
        }


    }
}
