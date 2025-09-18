package test7.Findstatic.a10;

public class PingPangTeacher extends Person implements speakEnglish{
    public PingPangTeacher() {
    }

    public PingPangTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void Play() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void English() {
        System.out.println("说英文");
    }
}
