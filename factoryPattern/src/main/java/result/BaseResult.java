package result;

import lombok.Data;

/**
 * @author xueneng on 2020/10/30.
 *         Description:
 */
@Data
public class BaseResult {
    private String code;
    private String info;

    public BaseResult(String code, String info){
        this.code = code;
        this.info = info;
    }
}
