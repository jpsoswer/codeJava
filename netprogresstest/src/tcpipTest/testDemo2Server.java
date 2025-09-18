package tcpipTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class testDemo2Server {
    public static void main(String[] args) throws IOException {
        //创建接收段对象
        ServerSocket ss = new ServerSocket(10086);

        Socket accept = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));

        int b;
        while ((b=br.read()) != -1)
        {
            System.out.print((char) b);
        }


        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("你也是".getBytes());

        br.close();
        accept.close();
        ss.close();




    }
}
