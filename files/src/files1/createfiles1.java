package files1;

import java.io.File;
import java.io.IOException;

public class createfiles1 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("E:\\progresscode_java\\files\\aaa");
        file1.mkdirs();
        File file2 = new File("aaa\\a.txt");
        file2.createNewFile();
    }
}
