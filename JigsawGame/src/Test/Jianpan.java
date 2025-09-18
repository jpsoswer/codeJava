package Test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Jianpan extends JFrame implements KeyListener {
    public Jianpan()
    {
        this.setSize(600,500);
        this.setLocationRelativeTo(null);
        this.setTitle("键盘");
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(3);

        JButton jb = new JButton("键盘");
        jb.setBounds(0,105,100,50);

        this.getContentPane().add(jb);
        jb.addKeyListener(this);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        char number = e.getKeyChar();
        System.out.println("按下了"+number+"键");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开按键");
    }
}
