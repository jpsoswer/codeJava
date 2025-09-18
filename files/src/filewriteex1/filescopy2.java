package filewriteex1;

import java.io.*;

public class filescopy2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\pre\\ads");
        File f2 = new File("E:\\pre\\zhan");
        copyps(f1,f2);
    }

    private static void copyps(File f1, File f2) throws IOException {
        f2.mkdirs();
        File[] files = f1.listFiles();
        for (File f : files) {
            //是文件
            if(f.isFile())
            {
                FileInputStream fis = new FileInputStream(f);
                FileOutputStream fos = new FileOutputStream(new File(f2,f.getName()));
                int len;
                byte[] bytes = new byte[1024];
                while((len=fis.read(bytes)) != -1)
                {
                    fos.write(bytes,0,len);
                }
                fos.close();
                fis.close();
            }
            //是文件夹
            else{
                copyps(f,new File(f2,f.getName()));
            }
        }
    }
}
