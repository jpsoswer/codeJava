package testNet;

import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.util.List;

public class PaChongDenmo3 {
    public static void main(String[] args) {
        //(https?://)?[^/\s]*
        //获取网站链接
        String url = "https://www.cfmem.com/";

        //获得网站的内容
        String s = HttpUtil.get(url);
        System.out.println(s);

        //筛选条件
        List<String> all = ReUtil.findAll("^https://.*$", s, 0);
        List<String> all1 = ReUtil.findAll("^.*六月\\s+2025.*$", all.toString(), 0);

        System.out.println(all1.toString());
    }
}
