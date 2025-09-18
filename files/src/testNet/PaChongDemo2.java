package testNet;

import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;
import com.sun.deploy.net.HttpUtils;

import java.util.List;

public class PaChongDemo2 {
    public static void main(String[] args) {
        String fimalyNamenet = "https://hanyu.baidu.com/shici/detail?from=aladdin&pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&smp_names=wordNewPrecise1%2CtermBrand2";
        String boyNamenet = "https://qiming.hao86.com/view/170514/";
        String girlNamenet = "https://qiming.hao86.com/view/73491/";
        String fimalyNameNet = HttpUtil.get(fimalyNamenet);
        String boyNameNet = HttpUtil.get(boyNamenet);
        String girlNameNet = HttpUtil.get(girlNamenet);
        // ArrayList<String> list = checkGuize(s, "([\\u4e00-\\u9fa5]{4})(，|。)", 1);
        // ArrayList<String> listboy = checkGuize(sboy, "((\\))([\\u4e00-\\u9fa5]{2}))", 1);
        //ArrayList<String> listgirl = checkGuize(sgirl, "(、)([\\u4e00-\\u9fa5]{2})", 2);
        List<String> fimalyName = ReUtil.findAll("([\\u4e00-\\u9fa5]{4})(，|。)", fimalyNameNet, 1);
        ReUtil.findAll("((\\))([\\u4e00-\\u9fa5]{2}))",boyNameNet,1);
        ReUtil.findAll("(、)([\\u4e00-\\u9fa5]{2})",girlNameNet,2);
        System.out.println(fimalyName);
    }
}
