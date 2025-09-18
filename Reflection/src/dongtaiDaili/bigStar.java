package dongtaiDaili;

public class bigStar implements Star{
    private String name;

    public bigStar() {
    }

    public bigStar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "bigStar{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String sing(String name) {
        System.out.println(this.name+"正在唱"+name);
        return "谢谢大家！";
    }

    @Override
    public void dance() {
        System.out.println(this.name+"正在跳舞");
    }
}
