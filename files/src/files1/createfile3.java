package files1;

import java.io.File;

public class createfile3 {
    public static void main(String[] args) {
        checkfiles();

    }
    public static void checkfiles()
    {
        File[] files = File.listRoots();
        for (File f : files) {
            checkfiles(f);
        }

    }

    public static void checkfiles(File file)
    {
        File[] files = file.listFiles();
        if (files!=null)
        {
            for (File f : files) {

                //如果是文件
                if(f.isFile())
                {
                    //提取文件名字
                    String name = f.getName();
                    if(name.endsWith(".avi"))
                    {
                        System.out.println(f);
                    }
                }
                //如果是文件夹
                else {
                    checkfiles(f);
                }
            }
        }

    }
}
