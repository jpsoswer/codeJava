package tcpipTest.textDemo5;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRuntimePool implements Runnable{
    Socket accept;
    public MyRuntimePool(Socket accept)
    {
        this.accept=accept;
    }

    @Override
    public void run() {
        try {
            //创建字节输入流对象
            BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
            //生成随机文件名
            String filename = UUID.randomUUID().toString().replace("-", "");
            //创建字节输出流的对象
            BufferedOutputStream bos = new BufferedOutputStream(
                    new FileOutputStream("E:\\progresscode_java\\netprogresstest\\server\\"+filename+".jpg"));

            int len;
            byte[] bytes = new byte[1024];
            while ((len = bis.read(bytes)) != -1)
            {
                bos.write(bytes,0,len);
            }
            //给传送的位置实时刷新数据
            bos.flush();
            //创建字符输出流对象
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));

            bw.write("传输成功！");
            bw.newLine();
            //关流

            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(accept != null)
            {
                try {
                    accept.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
