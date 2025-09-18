package test7.Findstatic.a01;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil()
    {

    }

    public static int maxStudentAge(ArrayList<Student> list)
    {
        int max = list.get(0).getAge();
        for(int i=1;i<list.size();i++)
        {
            int number = list.get(i).getAge();
            if(number > max)
            {
                max = number;
            }
        }
        return max;
    }
}
