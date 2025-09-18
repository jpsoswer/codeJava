package files1;

import java.io.File;

public class deletefiles1 {
    public static void main(String[] args) {
        File f1 = new File("E:\\aab");
        delete(f1);

    }

    //删除文件方法
    public static void delete(File file)
    {
        File[] files = file.listFiles();
        if(files!=null)
        {
            for (File f : files) {
                //判断是不是文件
                if (f.isFile())
                {
                    f.delete();
                }
                else {
                    delete(f);
                }
            }
        }
        file.delete();
    }
}
