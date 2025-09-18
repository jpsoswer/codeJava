package filewriteex1;

import java.io.*;

public class filescopy {
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\pre\\ads");
        File f2 = new File("E:\\progresscode_java\\files\\bbb");
        filecopy(f1,f2);
    }

    private static void filecopy(File f1, File f2) throws IOException {
        f2.mkdirs();
        File[] files = f1.listFiles();
        for (File f : files) {
            //如果是文件2
            if(f.isFile())
            {
                FileInputStream fis = new FileInputStream(f1);
                FileOutputStream fos = new FileOutputStream(new File(f2,f1.getName()));
                int len;
                byte[] be = new byte[1024];
                while((len=fis.read(be)) != -1)
                {
                    fos.write(be,0,len);
                }

                //流结束
                fos.close();
                fis.close();
            }
            //如果是文件夹
            else{
                filecopy(f,new File(f2,f1.getName()));
            }
        }

    }

    //创建方法用以拷贝数据

}
