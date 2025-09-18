package test7.Findstatic.a10;

public class Test {
    public static void main(String[] args) {
        PingPang ping = new PingPang();
        ping.setName("马龙");
        ping.setAge(36);
        System.out.println(ping.getName() + ", " + ping.getAge());
        ping.Play();
        ping.English();
        System.out.println("--------------------------");
        Basketball bk = new Basketball();
        bk.setName("姚明");
        bk.setAge(44);
        System.out.println(bk.getName() + ", " + bk.getAge());
        bk.Play();
    }
}
