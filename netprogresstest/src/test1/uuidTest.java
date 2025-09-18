package test1;

import java.util.UUID;

public class uuidTest {
    public static void main(String[] args) {
        String replace = UUID.randomUUID().toString().replace("-", "");
        System.out.println(replace);
    }
}
