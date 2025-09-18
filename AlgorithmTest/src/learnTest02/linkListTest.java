package learnTest02;

import org.junit.Test;

public class linkListTest {
    @Test
    public void test1()
    {
        //定义对象
        linkList ll = new linkList();
        //添加数据
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        //遍历链表
        ll.loop((elemat)->{
            System.out.println(elemat);
        });

        ll.loop01((elemat)->{
            System.out.println(elemat);
        });

    }

    @Test
    public void test2()
    {
        linkList ll = new linkList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);

        //遍历数据
        for (Integer i : ll) {
            System.out.println(i);
        }
    }

}
