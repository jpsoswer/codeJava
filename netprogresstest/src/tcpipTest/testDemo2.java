package tcpipTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class testDemo2 {
    public static void main(String[] args) throws IOException {
        //创建服务器端对象
        Socket sk = new Socket("127.0.0.1",10086);

        //创建输出端对象
        OutputStream outputStream = sk.getOutputStream();

        outputStream.write("你是好人".getBytes());

        sk.shutdownOutput();

        BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        int b;
        while ((b=br.read()) != -1)
        {
            System.out.print((char) b);
        }

        //关流

        outputStream.close();
        sk.close();
        br.close();


    }
}
