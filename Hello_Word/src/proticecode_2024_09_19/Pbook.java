package proticecode_2024_09_19;
class Person{
    private String name;
    private int age;
    private Book book;
    public Person(String name,int age)
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
    public Book getbook(Book book)
    {
        this.book = book;
        return book;
    }
}
class Book{
    private String bname;
    private int page;
    private Person per;
    public Book(String bname,int page)
    {
        this.bname = bname;
        this.page = page;
    }
    public String getname()
    {
        return bname;
    }
    public int getage()
    {
        return page;
    }
    public Person getbook(Person per)
    {
        this.per = per;
        return per;
    }
}
public class Pbook {
    public static void main(String[] args) {
        Person pe = new Person("张三",23);
        Book bk = new Book("JAVA程序开发",60);
        System.out.println("姓名为：" + pe.getname() + "年龄为：" + pe.getage() + "--->  书名：" + pe.getbook(bk).getname() +
                "价格：" + pe.getbook(bk).getage());
        System.out.println("书名为：" + bk.getname() + "价格为：" + bk.getage() + "--->  人名:" + bk.getbook(pe).getname() +
                "年龄：" + bk.getbook(pe).getage());
    }
}
