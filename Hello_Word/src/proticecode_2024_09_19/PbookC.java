package proticecode_2024_09_19;
class Pertion{
    private String name;
    private int age;
    private Book1 book;
    private Person chien;
    public Pertion(String name , int age)
    {
        this.name = name;
        this.age = age;
    }
    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
    public Book1 getbook(Book1 book)
    {
        this.book = book;
        return book;
    }
}
class Book1{
    private String bname;
    private int page;
    private Pertion person;
    private Book chienbook;
    public Book1(String bname , int page)
    {
        this.bname = bname;
        this.page = page;
    }
    public String getbname()
    {
        return bname;
    }
    public int getpage()
    {
        return page;
    }
    public Pertion getbook(Pertion person)
    {
        this.person = person;
        return person;
    }
}
public class PbookC {
    public static void main(String[] args) {
        Pertion pe = new Pertion("张三",32);
        Book1 bk = new Book1("JAVA程序设计",43);
        Pertion ch = new Pertion("张飞洋",6);
        Book1 bkc = new Book1("一千零一夜",59);
        System.out.println(ch.getname()+ "的父亲是" + pe.getname() + pe.getage() + "岁 --->  " +
        "书名：" + pe.getbook(bk) +"  价格" + pe.getbook(bk).getpage()        );
    }
}
