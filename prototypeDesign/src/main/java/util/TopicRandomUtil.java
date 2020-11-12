package util;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.*;

/**
 * @author xueneng on 2020/11/12.
 *         Description:
 */
public class TopicRandomUtil {
    /**
     *
     * @param option 选择项列表
     * @param key 正确答案
     * @return
     */
    public static Topic random(Map<String,String> option,String key){
        Set<String> keySet = option.keySet();
        List<String> newList = new ArrayList<String>(keySet);
        Collections.shuffle(newList);
        Map<String,String> newOption = new HashMap<String, String>();
        String newKey = "",randomKey  = "";
        int idx = 0;
        for (String s : keySet) {
            randomKey = newList.get(idx++);
            if(s.equals(key)){
                newKey = randomKey;
            }
            newOption.put(randomKey,option.get(s));
        }
        return new Topic(newOption,newKey);
    }
}
