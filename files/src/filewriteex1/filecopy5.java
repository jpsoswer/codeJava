package filewriteex1;

import java.io.*;
import java.util.Arrays;

public class filecopy5 {
    public static void main(String[] args) throws IOException {
        //读取文件数据
        FileReader fr = new FileReader("src\\gs.txt");
        StringBuilder sb = new StringBuilder();
        int len;
        while ((len = fr.read()) != -1) {
            sb.append((char) len);
        }
        fr.close();
        //排序
        Integer[] array = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted().toArray(Integer[]::new);
        String string = Arrays.toString(array);
        String sub = string.replace(", ", "-");
        String substring = sub.substring(1, sub.length() - 1);

        System.out.println(substring);

        //写出
        FileWriter fw = new FileWriter("src\\gw.txt");
        fw.write(substring);
        fw.flush();
        fw.close();

    }
}
