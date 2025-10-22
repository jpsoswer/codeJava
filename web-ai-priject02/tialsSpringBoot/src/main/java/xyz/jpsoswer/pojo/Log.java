package xyz.jpsoswer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Log {
    private Integer id;
    private Integer operateEmpId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate operateTime;
    private String className;
    private String methodName;
    private String methodParams;
    private String returnValue;
    private Integer costTime;
    private String operateEmpName;
}
