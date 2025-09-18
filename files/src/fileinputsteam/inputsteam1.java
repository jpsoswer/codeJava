package fileinputsteam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class inputsteam1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\iobit\\shihao.mp4");
        FileOutputStream fos = new FileOutputStream("E:\\progresscode_java\\files\\shi.mp4");
        long l = System.currentTimeMillis();
        int b;
        while ((b=fis.read()) != -1)
        {
            fos.write(b);
        }

        //释放资源
        fos.close();
        fis.close();
        long r = System.currentTimeMillis();
        System.out.println(r-l);

    }
}
