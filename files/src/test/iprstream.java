package test;

import java.io.*;
import java.nio.charset.Charset;

public class iprstream {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\pre\\ads\\ad.txt"),"GBK");
        int len;
        while ((len = isr.read()) != -1)
        {
            System.out.print((char) len);
        }
        isr.close();

    }
}
