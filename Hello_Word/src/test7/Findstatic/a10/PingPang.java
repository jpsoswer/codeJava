package test7.Findstatic.a10;

public class PingPang extends Person implements speakEnglish{
    public PingPang() {
    }

    public PingPang(String name, int age) {
        super(name, age);
    }

    @Override
    public void Play() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void English() {
        System.out.println("说英文");
    }
}
