package filewriteex1;

import java.io.*;

public class fanbianyi2 {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\pre\\ads\\bxc.jpg"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\pre\\ads\\he.jpg"));
        int len;
        while ((len = isr.read())!= -1)
        {
            osw.write(len ^ 10);
        }
        osw.close();
        isr.close();
        long r = System.currentTimeMillis();
        System.out.println(r-l);

    }
}
