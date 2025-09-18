package learnTest01;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

//动态数组实现操作
public class DmArrays implements Iterable<Integer> {

    private  int size = 0;
    private  int chang = 8;
    //复制空数组避免资源的浪费
    private  int[] arr = {};

    //输入数据
    public void addList(int elemat) {
        install(size, elemat);
    }

    //插入数据
    public void install(int index, int elemat) {
        //扩容数组
        extracted();
        //拷贝数据
        if (index >= 0 && index < size) {
            System.arraycopy(arr, index, arr, index + 1, size - index);

        }
        arr[index] = elemat;
        size++;
    }

    //扩容数组
    private void extracted() {

        if(size==0)
        {
            arr = new int[chang];
        }
        else if(size==chang)
        {
            chang+=chang>>>1;
            int[] newArray = new int[chang];
            System.arraycopy(arr,0,newArray,0,size);
            arr=newArray;
        }
    }

    //查询数据
    public int find(int index)
    {
        return arr[index];
    }

    //遍历数据

    public void forEatch(Consumer<Integer> shu)
    {
        for (int i = 0; i < 5; i++) {
            shu.accept(arr[i]);
        }
    }

    //迭代器遍历
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int i=0;
            @Override
            public boolean hasNext() {
                return i<size;
            }

            @Override
            public Integer next() {
                return arr[i++];
            }
        };
    }

    //流便利
   public IntStream stream()
   {
       return IntStream.of(Arrays.copyOfRange(arr,0,size));
   }

   //删除元素
    public int remove(int index)
    {
        int elemat=arr[index];
        System.arraycopy(arr,index+1,arr,index,size-index-1);
        size--;
        return elemat;
    }
}
