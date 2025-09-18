package bufffilestream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedchar2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("z.txt",true));
        bw.write("晚风吹起你并肩的白发");
        bw.newLine();
        bw.newLine();
        bw.write("黑咖啡品味有多浓");

        bw.close();
    }
}
