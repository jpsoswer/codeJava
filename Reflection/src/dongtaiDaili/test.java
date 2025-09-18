package dongtaiDaili;

public class test {
    public static void main(String[] args) {
        //创建bigStar对象
        bigStar bigStar = new bigStar("鸡哥");

        Star star = ParUtil.cateProey(bigStar);
        String smallstar = star.sing("小星星");

        System.out.println(smallstar);
        star.dance();
    }
}
