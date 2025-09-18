package filewriteex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fanbiyi {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("E:\\pre\\ads\\bxc.jpg");
        FileOutputStream fos = new FileOutputStream("E:\\pre\\ads\\he.jpg");
        int len;
        while ((len = fis.read())!= -1)
        {
            fos.write(len ^ 10);
        }
        fos.close();
        fis.close();
        long r = System.currentTimeMillis();
        System.out.println(r-l);

    }
}
