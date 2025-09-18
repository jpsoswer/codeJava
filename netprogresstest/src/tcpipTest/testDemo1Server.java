package tcpipTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class testDemo1Server {
    public static void main(String[] args) throws IOException {
        //创建服务端对象，来接受数据
        ServerSocket ss = new ServerSocket(10086);

        //接受数据
        Socket accept = ss.accept();

        //创建字符输入流的对象来接受数据
        BufferedReader br =
                new BufferedReader(new InputStreamReader(accept.getInputStream()));

        int b;
        while ((b=br.read()) != -1)
        {
            System.out.print((char) b);
        }

        //关流
        br.close();
        accept.close();
        ss.close();
    }
}
