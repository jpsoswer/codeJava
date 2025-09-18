package fileinputsteam;

import java.io.*;

public class inputsteam2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream("E:\\iobit\\shihao.mp4"));
        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("E:\\progresscode_java\\files\\shi.mp4"));
        long l = System.currentTimeMillis();
        int len;
        byte[] by = new byte[1024];
        while ((len=fis.read(by)) != -1)
        {
            fos.write(by,0,len);
        }

        //释放资源
        fos.close();
        fis.close();
        long r = System.currentTimeMillis();
        System.out.println(r-l);

    }
}
