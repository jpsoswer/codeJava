package bufffilestream;

import java.io.*;

public class buff1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\progresscode_java\\files\\src\\gs.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src\\c.txt"));
        byte[] by = new byte[1024];
        int len;
        while((len=bis.read(by))!=-1)
        {
            bos.write(by,0,len);
        }
        //关流
        bos.close();
        bis.close();
    }
}
