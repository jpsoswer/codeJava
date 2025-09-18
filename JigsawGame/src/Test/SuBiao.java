package Test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SuBiao extends JFrame implements MouseListener {
    public SuBiao()
    {
        //创建一个界面
        this.setSize(650,500);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置界面名称
        this.setTitle("鼠标");
        //设置界面总是在上
        this.setAlwaysOnTop(true);
        //设置程序关闭条件
        this.setDefaultCloseOperation(3);
        //设置界面取消默认排列
        this.setLayout(null);
        //设置界面显示
        this.setVisible(true);
        //创建按钮对象
        JButton jb = new JButton("鼠标");
        //设置按钮大小
        jb.setBounds(0,0,100,50);
        //将按钮存到默认容器中
        this.getContentPane().add(jb);
        //创建鼠标监听对象
        jb.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按住不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }
}
