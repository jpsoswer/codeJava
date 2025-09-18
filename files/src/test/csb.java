package test;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class csb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\gs.txt"));
        String line;
        ArrayList<String> arr = new ArrayList<>();
        while ((line = br.readLine()) != null)
        {
            arr.add(line);
        }
        br.close();
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char c = o1.charAt(0);
                int i1 = c-'0';
                char c1 = o2.charAt(0);
                int i2 = c1-'0';
                return i1-i2;
            }
        });
        BufferedWriter bw = new BufferedWriter(new FileWriter("fi.txt"));
        for (String s : arr) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
        System.out.println(arr);
    }
}
