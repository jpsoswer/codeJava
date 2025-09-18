package test;

import java.io.*;

public class iwstream {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\pre\\ads\\ad.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\pre\\ads\\add.txt"),"GBK");
        int len;
        while((len=isr.read()) != -1)
        {
            osw.write((char)len);
        }
        osw.close();
        isr.close();
    }
}
