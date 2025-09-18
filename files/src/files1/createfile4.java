package files1;

import java.io.File;

public class createfile4 {
    public static void main(String[] args) {
        File file = new File("E:\\iobit\\aab");
        Long sum = count(file);
        System.out.println(sum);


    }

    //开始递归统计文件大小
    public static Long count(File file)
    {
        long count=0;
        File[] files = file.listFiles();
        //开始循环
        for (File f : files) {
            //如果是文件
            if(f.isFile())
            {
                count+=f.length();
            }
            //如果是文件夹
            else {
                count+=count+count(f);
            }
        }

        return count;
    }
}
