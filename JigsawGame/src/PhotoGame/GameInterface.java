package PhotoGame;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

//继承窗体类，可进行窗体操作
public class GameInterface extends JFrame implements KeyListener {
    //创建一个二维数组
    int[][] arr = new int[4][4];
    //记录白块的位置
    int x = 0;
    int y = 0;
    public GameInterface()
    {

        //创建窗体
        jFrame();
        //创建菜单
        jMenuBar();
        //生成随机值
        suijiArray();
        //创建图片区域
        imageIcon();
        //取消照片默认放置位置
        this.setLayout(null);
        //窗体默认是隐藏的此命令是将窗体显示
        this.setVisible(true);

    }

    public void suijiArray()
    {
        int n = 1;
        //二维数组初始化
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0;j < arr[i].length;j++)
            {
                arr[i][j] = n;
                n++;
            }
        }
        //形成随机值
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0;j < arr[i].length;j++)
            {
                //形成0-4随机值
                int suiji = rd.nextInt(4);
                int suijione = rd.nextInt(4);


                //开始交换

                int t = arr[i][j];
                arr[i][j] = arr[suiji][suijione];
                arr[suiji][suijione] = t;

                if(arr[i][j] == 16)
                {
                    x = i;
                    y = j;
                }
            }
        }
    }
    private void imageIcon() {
        //清空原本已经出现的所有图片
        this.getContentPane().removeAll();
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                //创建一个图片对象
                ImageIcon im = new ImageIcon("E:\\progresscode_java\\JigsawGame\\images\\dog01\\"+arr[i][j]+".gif");

                //创建一个容器来放图片
                JLabel jb = new JLabel(im);
                //放置图片位置
                jb.setBounds(j*105+83,i*105+134,105,105);
                //设置图像边框
                jb.setBorder(new BevelBorder(0));
                //将船创建建的容器存放在默认的容器中
                this.getContentPane().add(jb);

            }
        }
        //创建一个背景图片对象
        ImageIcon imB = new ImageIcon("E:\\progresscode_java\\JigsawGame\\gameB03.jpg");
        //创建一个容器存储
        JLabel jb1 = new JLabel(imB);
        //设置放置图片位置
        jb1.setBounds(40,40,508,560);
        //放入默认的容器当中
        this.getContentPane().add(jb1);

        //刷新一下界面
        this.getContentPane().repaint();

    }

    private void jMenuBar() {
        //创建菜单对象
        JMenuBar jb = new JMenuBar();
        //创建菜单项对象
        JMenu Function = new JMenu("功能");
        JMenu aboutMe = new JMenu("关于我们");
        //创建条目对象
        JMenuItem regitGame = new JMenuItem("重新游戏");
        JMenuItem regitLogin = new JMenuItem("重新登陆");
        JMenuItem exitGame = new JMenuItem("关闭游戏");
        JMenuItem Offic = new JMenuItem("公众号");
        //添加菜单与菜单栏之间的关系
        jb.add(Function);
        jb.add(aboutMe);

        //添加菜单栏与条目之间的关系
        Function.add(regitGame);
        Function.add(regitLogin);
        Function.add(exitGame);
        aboutMe.add(Offic);

        //使菜单栏显示
        this.setJMenuBar(jb);
    }

    private void jFrame() {
        //游戏界面大小设计
        this.setSize(603,680);
        //标题设计
        this.setTitle("拼图游戏 1.0");
        //设置窗体总显示在其他页面之上
        this.setAlwaysOnTop(true);
        //设置页面居中
        this.setLocationRelativeTo(null);
        //设置结束程序
        this.setDefaultCloseOperation(3);
        //为窗体添加键盘监听
        this.addKeyListener(this);
    }
//键盘监听
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int  code = e.getKeyCode();
        if(code == 65)
        {
            //删除之前所有图片格式
            this.getContentPane().removeAll();
            //创建存储图片容器
            JLabel jb = new JLabel(new ImageIcon("JigsawGame\\dog01.jpg"));
            //设置容器位置
            jb.setBounds(83,134,420,420);
            //将船舰的容器放到页面中
            this.getContentPane().add(jb);
            //创建一个背景图片对象
            ImageIcon imB = new ImageIcon("E:\\progresscode_java\\JigsawGame\\gameB03.jpg");
            //创建一个容器存储
            JLabel jb1 = new JLabel(imB);
            //设置放置图片位置
            jb1.setBounds(40,40,508,560);
            //放入默认的容器当中
            this.getContentPane().add(jb1);

            //刷新一下界面
            this.getContentPane().repaint();

            imageIcon();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //记录一下所操作的数
        int number = e.getKeyCode();
        //操作按钮创建
        if(number == 37)
        {
            System.out.println("向左移动");
            //边界问题
            if(y == 3)
            {
                return;
            }
            //开始交换
            arr[x][y] = arr[x][y+1];
            arr[x][y+1] = 16;
            y++;
            //调用方法重新加载图片
            imageIcon();
        }
        else if(number == 38)
        {
            System.out.println("向上移动");
            //边界问题
            if(x == 3)
            {
                return;
            }
            //开始交换
            arr[x][y] = arr[x+1][y];
            arr[x+1][y] = 16;
            x++;
            //调用方法重新加载图片
            imageIcon();
        } else if (number == 39) {
            System.out.println("向右移动");
            //边界问题
            if(y == 0)
            {
                return;
            }
            //开始交换
            arr[x][y] = arr[x][y-1];
            arr[x][y-1] = 16;
            y--;
            //调用方法重新加载图片
            imageIcon();
        } else if (number == 40) {
            System.out.println("向下移动");
            //边界问题
            if(x == 0)
            {
                return;
            }
            //开始交换
            arr[x][y] = arr[x-1][y];
            arr[x-1][y] = 16;
            x--;
            //调用方法重新加载图片
            imageIcon();
        }
    }
}
