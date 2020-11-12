package util;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xueneng on 2020/11/12.
 *         Description:
 */
@Data
public class Topic {
    Map<String,String> option = new HashMap<String, String>();
    String key;

    public Topic(Map<String,String> option,String key){
        this.option = option;
        this.key = key;
    }
}
