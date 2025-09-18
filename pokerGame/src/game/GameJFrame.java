package game;

import domain.Poker;
import doudizhu1.PokerGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GameJFrame extends JFrame implements ActionListener {
    //获取界面隐藏容器，现在获取了以后方便用
    public static Container container = null;

    //管理抢与不抢两个按钮
    JButton[] landlord = new JButton[2];
    //管理出牌与不出牌两个按钮
    JButton[] publishCard = new JButton[2];

    //游戏界面中的地主图标
    JLabel dizhu;

    //集合嵌套集合
    //大集合中有三个小集合
    //小集合中装着每一个玩家要出的牌
    //0索引：左边的电脑玩家
    //1索引：玩家自己
    //2索引：右边的电脑玩家
    ArrayList<ArrayList<Poker>> currentList = new ArrayList<>();

    //集合嵌套集合
    //大集合中有三个小集合
    //小集合中装着每一个玩家手上的牌
    //0索引：左边的电脑玩家
    //1索引：玩家自己
    //2索引：右边的电脑玩家
    ArrayList<ArrayList<Poker>> playerList = new ArrayList<>();

    //底牌
    ArrayList<Poker> lordList = new ArrayList<>();

    //牌盒，装所有的牌
    ArrayList<Poker> pokerList = new ArrayList();

    //三个玩家前面的文本提示
    //0索引：左边的电脑玩家
    //1索引：玩家自己
    //2索引：右边的电脑玩家
    JTextField[] time = new JTextField[3];

    public GameJFrame()
    {
        //设置任务栏图标
        setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\progresscode_java\\pokerGame\\image\\poker\\baixiaochun.jpg"));
        //设置界面
        initJframe();
        //添加组件
        initView();
        //界面显示出来
        //先展示界面在发牌，因为发牌里面有动画，界面不展示出来，动画无法展示
        this.setVisible(true);

        //初始化牌
        //准备牌，洗牌，发牌，排序
        initCard();
        //打牌之前的准备工作
        initGame();

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //打牌之前的准备工作
    public void initGame()
    {
        //创建三个集合用来装三个玩家的牌
        for (int i=0;i<3;i++)
        {
            ArrayList<Poker> list = new ArrayList<>();
            //添加到大集合中方便管理
            currentList.add(list);
        }
        //展示抢地主和不抢两个按钮
        landlord[0].setVisible(true);
        landlord[1].setVisible(true);

        //展示自己前面的倒计时文本
        for (JTextField field: time)
        {
            field.setText("倒计时30秒");
            field.setVisible(true);
        }
    }

    //初始化牌（准备牌，洗牌，发牌，排序）
    public  void initCard()
    {
        //准备牌
        //把所有的牌，放到cardList当中
        for (int i = 1; i <=5 ; i++) {
            for (int j=1;j<=13;j++)
            {
                if((i==5)&&j>2)
                {
                    break;
                }
                else {
                    Poker poker = new Poker(i+"-"+j,false);
                    poker.setLocation(350,150);
                    pokerList.add(poker);
                    container.add(poker);
                }
            }
        }

        //洗牌
        Collections.shuffle(pokerList);

        //创建三个集合来装三个玩家的牌，并把三个小集合放到一个大集合当中方便管理
        ArrayList<Poker> player0 = new ArrayList<>();
        ArrayList<Poker> player1 = new ArrayList<>();
        ArrayList<Poker> player2 = new ArrayList<>();

        //发牌
        for (int i = 0; i < pokerList.size(); i++) {
            //获取当前便利的牌
            Poker poker = pokerList.get(i);

            //发三张底牌
            if(i<=2)
            {
                //把牌添加到集合中
                lordList.add(poker);
                Common.move(poker,poker.getLocation(),new Point(270+(75*i),10));
                continue;
            }

            //给三个玩家发牌
            if(i%3==0)
            {
                //给左边的玩家发牌
                Common.move(poker,poker.getLocation(),new Point(50,60+(i*5)));
                player0.add(poker);
            } else if (i%3==1) {
                //给自己发牌
                Common.move(poker,poker.getLocation(),new Point(180+(i*7),450));
                player1.add(poker);
                //把自己的牌展示正面
                poker.trunFront();
            } else if (i%3==2) {
                //给右边的玩家发牌
                Common.move(poker,poker.getLocation(),new Point(700,60+(i*5)));
                player2.add(poker);
            }
            //把当前的牌至于最顶端，这样就会产生牌依次错开起来的效果
            container.setComponentZOrder(poker,0);
        }
        //把三个装有牌的小集合放到大集合中统一管理
        playerList.add(player0);
        playerList.add(player1);
        playerList.add(player2);



        //排序
        for (int i=0;i<3;i++)
        {
            order(playerList.get(i));
            Common.rePosition(this,playerList.get(i),i);
        }
    }

    //排序
    public  void order(ArrayList<Poker> pokers)
    {
        //创建自定义排序
        Collections.sort(pokers, new Comparator<Poker>() {
            @Override
            public int compare(Poker o1, Poker o2) {
                //获得o1的花色
                int c1 = Integer.parseInt(o1.getName().substring(0,1));
                //获得o1的价值
                int value1 = getValue(o1);
                //获得o2的花色
                int c2 = Integer.parseInt(o2.getName().substring(0,1));
                //获得o2的价值
                int value2 = getValue(o2);
                //倒序排列
                int flag = value2 - value1;

                //如果价值一样就按花色排序
                if(flag==0)
                {
                    return c2-c1;
                }
                else{
                    return flag;
                }
            }
        });
    }

    //价值
    public  int getValue(Poker poker)
    {
        //获取牌的名字
        String name = poker.getName();
        //获取牌的花色
        int color = Integer.parseInt(poker.getName().substring(0,1));
        //获取牌对应的数字，同时也是拍的价值
        int value = Integer.parseInt(name.substring(2));

        //判断大小王的价值
        if(color == 5)
        {
            return value+=100;
        }
        //计算A的价值
        if(value==1)
        {
            return value+=20;
        }
        //计算2的价值
        if(value==2)
        {
            return value+=30;
        }
        return value;
    }

    //添加组件
    public void  initView()
    {
        //创建抢地主的按钮
        JButton roBut = new JButton("抢地主");
        //设置位置
        roBut.setBounds(320,400,75,20);
        //添加点击事件
        roBut.addActionListener(this);
        //设置隐藏
        roBut.setVisible(false);
        //添加到数组中统一管理
        landlord[0] = roBut;
        //添加到界面中
        container.add(roBut);

        //创建不抢的按钮
        JButton noBut = new JButton("不  抢");
        //设置位置
        noBut.setBounds(420,400,75,20);
        //添加点击事件
        noBut.addActionListener(this);
        //设置隐藏
        noBut.setVisible(false);
        //添加到数组中统一管理
        landlord[1] = noBut;
        //添加到界面中
        container.add(noBut);

        //创建三个玩家的提示文字：倒计时
        //每个玩家一个
        //0索引：左边的电脑玩家
        //1索引：玩家自己
        //2索引：右边的电脑玩家
        for(int i=0;i<3;i++)
        {
            time[i] = new JTextField("倒计时:");
            time[i].setEditable(false);
            time[i].setVisible(false);
            container.add(time[i]);
        }
        time[0].setBounds(140,230,60,20);
        time[1].setBounds(374,360,60,20);
        time[2].setBounds(620,230,60,20);

        //创建地主图标
        dizhu = new JLabel(new ImageIcon("image\\poker\\baixiaochun.jpg"));
        dizhu.setVisible(false);
        dizhu.setSize(40,40);
        container.add(dizhu);

    }

    //设置界面
    public void initJframe()
    {
        //设置标题
        this.setTitle("斗地主");
        //设置大小
        this.setSize(830,620);
        //设置关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口无法进行调节
        this.setResizable(false);
        //界面剧中
        this.setLocationRelativeTo(null);
        //获取界面中的隐藏容器，以后直接用无需再次调用方法获取了
        container = this.getContentPane();
        //取消内部默认的居中放置
        container.setLayout(null);
        //设置背景颜色
        container.setBackground(Color.LIGHT_GRAY);

    }
}
