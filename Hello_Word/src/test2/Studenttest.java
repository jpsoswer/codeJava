package test2;

public class Studenttest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student s1 = new Student("1","张三",19);
        Student s2 = new Student("2","李四",18);
        Student s3 = new Student("3","王五",19);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        Student s4 = new Student("4","赵六",20);
        if(issame(arr,s4.getId()))            //判断学号是否重复
        {
            System.out.println("学号重复请删除重复学好后再加入");
        }
        //不重复开始
        else{
            int count=manor(arr);
            if(arr.length == count)
            {
                Student[] newArr = newArr(arr);
                newArr[count] = s4;
                newArr= remove(newArr,"2");
                yearjia(newArr,"3");
                printArr(newArr);
            }
            else
            {
                arr[count] = s4;
                arr = remove(arr,"2");
                yearjia(arr,"3");
                printArr(arr);
            }
        }
        //不重复结束
    }
    public static boolean issame(Student[] arr,String n)             //查看学号是否重复
    {
        for(int i = 0;i< arr.length;i++)
        {
            Student ar=arr[i];
            if(ar!=null) {
                if (ar.equals(n)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static int manor(Student[] arr)                          //查看数组有没有满
    {
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != null)
            {
                count++;
            }
        }
        return count;
    }
    public static Student[] newArr(Student[] arr)                     //新创建一个数组，并返回
    {
        Student[] newArr = new Student[arr.length+1];
        for(int i=0;i<arr.length;i++)
        {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    public static void printArr(Student[] x)                      //打印数组中的每一个数
    {
        for(int i = 0;i<x.length;i++)
        {
            Student se = x[i];
            if(se != null)                       //数组元素若为空的话se将不能调用其他方法
                System.out.println(se.getId()+ "," + se.getName() + "," + se.getAge());
        }
    }
    public static Student[] remove(Student[] arr,String id)             //删除学号为某的学生的信息
    {
        for(int i=0;i<arr.length;i++)
        {
            Student se = arr[i];
            if(se.getId() == "2")
            {
                arr[i] = null;
                return arr;
            }
        }
        System.out.println("删除失败");
        return arr;
    }
    public static Student[] yearjia(Student[] arr,String id)               //查找某同学的学号将该同学的年龄加1
    {
        for(int i=0;i<arr.length;i++)
        {
            Student se = arr[i];
            if(se != null)
                if(se.getId() == "3")
                {
                    se.setAge(se.getAge()+1);
                }
        }
        return arr;
    }
}
