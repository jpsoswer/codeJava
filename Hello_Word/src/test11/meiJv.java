package test11;

public class meiJv {
    public static void main(String[] args) {
        System.out.println(Color.RED);
    }
}
enum Color{

    RED(255,0,255,"红色"),GREEN(255,123,34,"绿色"),BLUE(255,255,123,"蓝色"),
    YOLLOW(132,146,213,"黄色");
    private int red;
    private int greenn;
    private int blue;
    private String value;

    Color(int red, int greenn, int blue,String value) {
        this.red = red;
        this.greenn = greenn;
        this.blue = blue;
        this.value = value;
    }

    @Override
    public String toString() {
        return super.toString()+"("+red+","+greenn+","+blue+")"+"->"+ value;
    }
}
