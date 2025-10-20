package xyz.jpsoswer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClazzsResult<T> {
    private Long total;
    private List<T> rows;
}
