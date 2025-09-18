package files1;

import java.io.File;
import java.io.FilenameFilter;

public class createfiles2 {
    public static void main(String[] args) {
        File file =new File("E:\\aab");
        boolean check = checkfile(file);
        System.out.println(check);
    }

    //筛选固定格式的文件夹
    public static boolean checkfile(File file)
    {
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isFile()&&f.getName().endsWith(".avd"))
            {
                return true;
            }
        }
        return false;
    }
}
