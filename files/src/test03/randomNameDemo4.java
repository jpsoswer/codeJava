package test03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class randomNameDemo4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\namesgender.txt"));
        ArrayList<String> studentName = new ArrayList<>();
        String xinxi;
        while ((xinxi = br.readLine()) != null)
        {
            studentName.add(xinxi);
        }
        //关流
        br.close();

        Random rd = new Random();
       while (true)
       {
           ArrayList<String> studentNameCopy = new ArrayList<>(studentName);

           while (!studentNameCopy.isEmpty())
           {

               int index = rd.nextInt(studentNameCopy.size());
               String remove = studentNameCopy.remove(index);
               System.out.println(remove);
           }
       }
    }
}
