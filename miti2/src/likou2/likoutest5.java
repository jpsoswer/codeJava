package likou2;

import java.util.ArrayList;
import java.util.Scanner;

public class likoutest5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<String> commans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            commans.add(scan.next());
        }
        int x = 0;
        int y = 0;
        for (int i = 0; i < commans.size(); i++) {
            String s = commans.get(i);
            if(s.equals("RIGHT"))
            {
                y+=1;
            } else if (s.equals("LEFT")) {
                y-=1;
            } else if (s.equals("UP")) {
                x-=1;
            }else {
                x+=1;
            }
        }
        System.out.println(x*n+y);
    }
}
