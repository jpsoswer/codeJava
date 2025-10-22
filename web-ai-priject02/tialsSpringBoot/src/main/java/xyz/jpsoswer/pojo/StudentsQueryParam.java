package xyz.jpsoswer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentsQueryParam {
    private Integer page = 1;     //页码
    private Integer pageSize = 10;       //每页的记录数
    private Integer clazzId;             //班级ID
    private String name;        //姓名
    private Integer degree;             //学历

}
