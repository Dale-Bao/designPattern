package question;

import lombok.Data;

import java.util.Map;

/**
 * @author xueneng on 2020/11/12.
 *         Description:
 */
@Data
public class AnswerQuestion {
    private String name;
    private String key;
    public AnswerQuestion(String name,String key){
        this.name = name;
        this.key = key;
    }

}
