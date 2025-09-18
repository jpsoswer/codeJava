package proticecode_2024_09_11;

import java.util.ArrayList;

public class NoteBook {
    private ArrayList<String> stu = new ArrayList<String>();
    public void getnote(String s)
    {
        stu.add(s);
    }
    public int getsize(int inex)
    {
        return stu.size();
    }
    public String getbook(int inex)
    {
        return stu.get(inex);
    }
    public void remove(int inex)
    {
        stu.remove(inex);
    }
    public String[] list()
    {
        String[] a = new String[stu.size()];
        stu.toArray(a);
        return a;
    }
    public static void main(String[] args) {
        NoteBook nb = new NoteBook();
        nb.getnote("张三今天欠我一万块钱");
        nb.getnote("李四昨天欠我10万块钱");
        nb.getnote("王五欠我一百万");
        String[] a = nb.list();
        for(String s: a)
        {
            System.out.println(s);
        }
    }
}
