package files1;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class careatefile5 {
    //创建集合来存储数据
    static HashMap<String,Integer> hm=new HashMap<>();

    public static void main(String[] args) {
        File file = new File("E:\\iobit\\aab");
        HashMap<String, Integer> tongji = tongji(file);
        Set<Map.Entry<String, Integer>> entries = tongji.entrySet();
        for (Map.Entry<String, Integer> et : entries) {
            String key = et.getKey();
            System.out.println(key+":"+et.getValue());

        }

    }

    //开始递归
    public static HashMap<String,Integer> tongji(File file)
    {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile())
            {
                String name = f.getName();
                String[] split = name.split("\\.");
                String s = split[split.length - 1];
                //判断文件格式是否正确
                if(split.length>=2)
                {

                    if(hm.containsKey(s))
                    {
                        Integer i = hm.get(s);
                        int count = i+1;
                        hm.put(s,count);
                    }
                    else{
                        hm.put(s,1);
                    }
                }

            }
            else {
                tongji(f);
            }
        }

        return hm;
    }

}
