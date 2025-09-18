package filewriteex1;

import java.io.*;
import java.util.Scanner;

public class filescopy4 {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        String lujing = scanner.next();
        String endlujing = scanner.next();
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream(lujing));
        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(endlujing));
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
