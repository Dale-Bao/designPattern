package store;

import java.util.Map;

/**
 * @author xueneng on 2020/10/30.
 *         Description:
 */
public interface ICommodity {
    /**
    *@Author: xueneng
    *@Parame: uid 用户id
     *        commodityId 奖品id
     *        bizId 业务id
     *        extMap 额外信息
    *@Date:14:42  2020/10/30
    */
    void sendCommodity(String uId,String commodityId,String bizId,Map<String,String> extMap);
}
