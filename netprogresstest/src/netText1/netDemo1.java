package netText1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class netDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        //定义主机ip对象
        InetAddress byName = InetAddress.getByName("DESKTOP-GVLSEPC");
        //打印主机ip
        String hostAddress = byName.getHostAddress();
        System.out.println(hostAddress);
        //打印主机名
        String hostName = byName.getHostName();
        System.out.println(hostName);
        //打印主机名与ip地址
        System.out.println(byName);
    }
}
