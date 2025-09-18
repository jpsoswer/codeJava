package test9;

import java.io.IOException;

public class Rm {
    public static void main(String[] args) throws IOException {
        //Runtime.getRuntime().exec("shutdown -s -t 30");
//        long index = Runtime.getRuntime().maxMemory();
//        System.out.println(index/1024/1024/1024);
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);
    }
}
