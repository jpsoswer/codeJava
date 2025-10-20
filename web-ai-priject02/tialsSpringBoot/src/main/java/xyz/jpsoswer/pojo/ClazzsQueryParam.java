package xyz.jpsoswer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClazzsQueryParam {
    private Integer page = 1;     //页码
    private Integer pageSize = 10;       //每页的记录数
    private String name;            //名字
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate begin;           //创建时间-开始
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate end;            //最后更新时间-结束

}
