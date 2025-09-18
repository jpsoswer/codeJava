package learnTest01;

import org.junit.Test;

import java.util.Iterator;

public class test1 {
    @Test
    public void test01()
    {
        DmArrays da = new DmArrays();
        da.addList(1);
        da.addList(2);
        da.addList(3);
        da.addList(4);

        da.install(2,5);

        //Consumer接口遍历，增强代码的灵活性
        da.forEatch((elemat)->{
            System.out.println(elemat);
        });

    }

    @Test
    public void test02()
    {
        DmArrays da = new DmArrays();
        da.addList(1);
        da.addList(2);
        da.addList(3);
        da.addList(4);
        for (Integer i : da) {
            System.out.println(i);
        }
    }

    //流便利
    @Test
    public void test03(){
        DmArrays da = new DmArrays();
        da.addList(1);
        da.addList(2);
        da.addList(3);
        da.addList(4);
        da.stream().forEach((elemat)->{
            System.out.println(elemat);
        });
    }

    //删除数据
    @Test
    public void test04(){
        DmArrays da = new DmArrays();
        da.addList(1);
        da.addList(2);
        da.addList(3);
        da.addList(4);
        da.addList(5);
        int remove = da.remove(2);
        System.out.println(remove);
        da.stream().forEach((elemat)->{
            System.out.println(elemat);
        });
    }

    @Test
    public void test05(){
        DmArrays da = new DmArrays();
        for (int i=0;i<=9;i++)
        {
            da.addList(i);
        }

        for (Integer i : da) {
            System.out.println(i);
        }

    }
}
