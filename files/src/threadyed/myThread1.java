package threadyed;

public class myThread1 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<30;i++)
        {
            System.out.println(getName()+"@"+i);
            //创建礼让线程
            Thread.yield();
        }
    }
}
