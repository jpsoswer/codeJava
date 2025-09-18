package threadyed;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class myThrad2 extends Thread{
    //创建lock锁对象
    static Lock lock = new ReentrantLock();
    static int count=0;
    @Override
    public void run() {
        while (true)
        {
            lock.lock();
            try {
                if(count == 100)
                {
                    break;
                }
                else{
                    sleep(100);
                    count++;
                    System.out.println(getName()+"窗口在卖第"+count+"张票!!!");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }

        }
    }
}
