package Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Adongtai extends JFrame implements ActionListener{
    public Adongtai()
    {
        //游戏界面大小设计
        this.setSize(500,400);
        //标题设计
        this.setTitle("按钮");
        //设置窗体总显示在其他页面之上
        this.setAlwaysOnTop(true);
        //设置页面居中
        this.setLocationRelativeTo(null);
        //设置结束程序
        this.setDefaultCloseOperation(3);
        //创建一个按钮对象
        JButton jb = new JButton("登录");
        //设置按钮位置，大小
        jb.setBounds(0,0,100,50);
        //调用动态监听
        jb.addActionListener(this);
        //放入默认容器中
        this.getContentPane().add(jb);
        //隐藏默认排列方式
        this.setLayout(null);
        //设置界面显示
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("已经登陆");
    }
}
