package tcpipTest.textDemo5;

import tcpipTest.testDemo4.MyRuntime;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class testDemo5Server {
    public static void main(String[] args) throws IOException {
        //创建线程池，以提高线程的利用率，防止资源的浪费
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(
                3,
                16,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        //创建服务端对象
        ServerSocket ss = new ServerSocket(10000);
        //放到循环当中，保持服务端不关闭
        while (true) {
            //创建接受数据
            Socket accept = ss.accept();
            //建立多线程保证数据传输效率
            tpe.submit(new MyRuntime(accept));
        }


    }
}
