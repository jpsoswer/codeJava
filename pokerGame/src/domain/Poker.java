package domain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Poker extends JLabel implements MouseListener {
    //属性
    //1.牌的名字 格式：数字-数字
    private String name;

    //2.牌显示是正面还是反面
    private boolean up;

    //3.是否可以被点击
    private boolean canClick = false;

    //4.当前状态表示牌是否已经被点击
    //如果没有被点击，点击之后会触发牌弹起的操作
    //如果已经被点击，点击之后会触发降落操作
    private boolean clicked = false;

    public Poker(String name,boolean up)
    {
        this.name = name;
        this.up = up;

        //判断当前牌是正面还是反面
        if(this.up)
        {
            //是正面
            trunFront();
        }
        else{
            //是反面
            trunRear();
        }

        //给牌设置宽高
        this.setSize(71,96);
        //把牌显示出来
        this.setVisible(true);
        //给牌添加鼠标监听事件
        this.addMouseListener(this);
    }

    //显示正面
    public void trunFront()
    {
        //给牌设置正面
        this.setIcon(new ImageIcon("E:\\progresscode_java\\pokerGame\\image\\poker\\Background.gif"));
        //修改成员变量
        this.canClick=true;
    }

    //显示反面
    public void trunRear()
    {
        //给牌设置反面
        this.setIcon(new ImageIcon("E:\\progresscode_java\\pokerGame\\image\\poker\\"+name+".gif"));
        //修改成员变量
        this.canClick=false;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        //点击
        //判断当前牌是否可以被点击
        if(this.canClick)
        {
            //党派被点击之后，要么升起，要么降落
            //表示牌的位移元素1
            int step =0;
            if(clicked)
            {
                //表示当前排已经被点击
                //降落(y增加20像素)
                step = 20;
            }
            else{
                //表示当前排没有被点击
                //降落(y减少20像素)
                step = -20;
            }
            //需要修改一下clicked变量记录的值
            clicked = !clicked;
            //修改一下拍的位置
            Point from = this.getLocation();
            //创建一个Pont对象，表示牌的结束位置
            Point to = new Point(from.x,from.y + step);
            //把最新的位置设置给牌
            this.setLocation(to);
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public boolean getUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
