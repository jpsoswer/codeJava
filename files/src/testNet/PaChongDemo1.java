package testNet;

import ObjectiputoutStream.Student;
import com.sun.jndi.toolkit.url.Uri;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaChongDemo1 {
    public static void main(String[] args) throws IOException {
        String fimalyNamenet = "https://hanyu.baidu.com/shici/detail?from=aladdin&pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&smp_names=wordNewPrecise1%2CtermBrand2";
        String boyNamenet = "https://qiming.hao86.com/view/170514/";
        String girlNamenet = "https://qiming.hao86.com/view/73491/";
        //创建姓
        String s = paChongNet(fimalyNamenet);
        ArrayList<String> list = checkGuize(s, "([\\u4e00-\\u9fa5]{4})(，|。)", 1);
        //把每个姓都取出来
        //创建性的集合
        ArrayList<String> xing = new ArrayList<>();
        for (String sname : list) {
            for (int i=0;i<4;i++)
            {
                xing.add(sname.charAt(i)+"");
            }
        }
        //创建男生名
        String sboy = paChongNet(boyNamenet);
        ArrayList<String> listboy = checkGuize(sboy, "((\\))([\\u4e00-\\u9fa5]{2}))", 1);
        //把男生的名都取出来
        //创建男生名的集合
        ArrayList<String> boyname = new ArrayList<>();
        for (String sboyname : listboy) {
            String[] split = sboyname.split("\\)");
            boyname.add(split[1]);
        }
        //创建女生名
        String sgirl = paChongNet(girlNamenet);
        ArrayList<String> listgirl = checkGuize(sgirl, "(、)([\\u4e00-\\u9fa5]{2})", 2);
        //把女生的名都取出来
        //创建女生集合
       ArrayList<String> girlname = new ArrayList<>();
        for (String string : listgirl) {
            if(!girlname.contains(string))
            {
                girlname.add(string);
            }
        }
        //调用函数返回数据
        ArrayList<String> listsum = inputList(xing, boyname, girlname, 50, 60);

        //System.out.println(girlname);
        Collections.shuffle(listsum);
        //打印数据
        for (String string : listsum) {
            System.out.println(string);
        }
        //写出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\names.txt"));
        for (String name : listsum) {
            bw.write(name);
            bw.newLine();
        }
        //关流
        bw.close();

    }

    //生成固定格式的集合
    public static ArrayList<String> inputList(ArrayList<String> xing,ArrayList<String> boyname,ArrayList<String> girlname,int borycount,int gilecount)
    {
        //开始生成男生的名字
        TreeSet<String> boyfaimyname = new TreeSet<>();
        while (true)
        {
            //判断条件到了就结束
            if(boyfaimyname.size()==borycount)
            {
                break;
            }
            //打乱数据
            Collections.shuffle(xing);
            Collections.shuffle(boyname);
            boyfaimyname.add(xing.get(0)+boyname.get(0));
        }
        //开始生成女生的名字
        TreeSet<String> girlfaimyname = new TreeSet<>();
        while (true)
        {
            //判断条件到了就结束
            if(girlfaimyname.size()==gilecount)
            {
                break;
            }
            //打乱数据
            Collections.shuffle(xing);
            Collections.shuffle(girlname);
            girlfaimyname.add(xing.get(0)+girlname.get(0));
        }
        //以固定格式打印数据
        Random rm = new Random();
        ArrayList<String> listsum = new ArrayList<>();
        for (String s : boyfaimyname) {
            int boyage = rm.nextInt(10)+18;
            listsum.add(s+"-男-"+boyage);
        }
        for (String s : girlfaimyname) {
            int girlage = rm.nextInt(8)+18;
            listsum.add(s+"-女-"+girlage);
        }
        return listsum;
    }




    //创建筛选规则
    public static ArrayList<String> checkGuize(String num, String quize, int index) {
        ArrayList<String> list = new ArrayList<>();
        //创建正则表达式规则对象
        Pattern compile = Pattern.compile(quize);
        //对num进行正则表达式的规则筛选
        Matcher matcher = compile.matcher(num);
        //查找符合条件的数据
        while (matcher.find()) {
            //将符合条件的数据存放起来
            String g = matcher.group(index);
            list.add(g);
        }
        return list;
    }


    //创建网络爬虫对象
    public static String paChongNet(String ur) throws IOException {
        //创建StringBuider对象
        StringBuilder sb = new StringBuilder();
        //创建网络链接对象
        URL url = new URL(ur);
        //打开网络链接
        URLConnection urlConnection = url.openConnection();
        InputStreamReader isr = new InputStreamReader(urlConnection.getInputStream());
        int len;
        while ((len = isr.read()) != -1) {
            sb.append((char) len);
        }
        isr.close();
        return sb.toString();
    }
}
