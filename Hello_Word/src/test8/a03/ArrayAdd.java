package test8.a03;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class ArrayAdd implements Iterable<Integer>{
    private int size = 0;
    private int rement = 8;
    private int[] arr = new int[rement];
    public void ArrayList(int number)
    {
        Add(size,number);
    }
    public void Add(int index,int number)
    {
        if(index >= 0 && index < size)
        {
            System.arraycopy(arr,index,arr,index+1,size-index);

        }
        arr[index] = number;
        size++;
    }
    public int getArray(int index)
    {
        return arr[index];
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int i = 0;
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return 0;
            }
        };
    }
}
