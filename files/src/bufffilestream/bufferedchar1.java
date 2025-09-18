package bufffilestream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bufferedchar1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\c.txt"));
        String line;
        while ((line = br.readLine()) != null)
        {
            System.out.println(line);
        }

        br.close();
    }
}
