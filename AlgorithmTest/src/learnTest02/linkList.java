package learnTest02;

import java.util.Iterator;
import java.util.function.Consumer;

public class linkList implements Iterable<Integer> {

    private link head=null;

    //迭代器遍历
    @Override
    public Iterator<Integer> iterator() {
        link p = head;
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return p!=null;
            }

            @Override
            public Integer next() {
                return p.value;
            }
        };
    }


    private static class link{
        int value;
        link next;

        public link(int value, link next) {
            this.value = value;
            this.next = next;
        }
    }

    //往链表中添加数据
    public void add(int value)
    {
        head = new link(value,head);
    }

    //遍历链表中的数据
    public void loop(Consumer<Integer> cur)
    {
        link p = head;
        while (p!=null)
        {
            cur.accept(p.value);
            p=p.next;
        }
    }

    //for循环遍历
    public void loop01(Consumer<Integer> con)
    {
        for (link p = head;p!=null;p=p.next)
        {
            con.accept(p.value);
        }
    }


}
