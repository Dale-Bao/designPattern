package question;

import lombok.Data;

import java.util.Map;

/**
 * @author xueneng on 2020/11/12.
 *         Description:
 */
@Data
public class ChoiceQuestion {
    private String name;
    private Map<String,String> option;
    private String key;

    public ChoiceQuestion(String name,Map<String,String> option,String key){
        this.name = name;
        this.option = option;
        this.key = key;
    }
}
