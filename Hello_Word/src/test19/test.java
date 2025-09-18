package test19;

public class test {
    public static void main(String[] args) {
        String s="hello";
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            sb.append(c[i]);
        }
        sb.delete(0,5);
        System.out.println(sb.toString());
    }
}
