package store.impl;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import result.BaseResult;
import service.couponService.CouponService;
import store.ICommodity;

import java.util.Map;

/**
 * @author xueneng on 2020/10/30.
 *         Description:
 */
public class CouponCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) {
        CouponService couponService = new CouponService();
        BaseResult baseResult = couponService.sendCoupon(uId,commodityId,bizId);
        logger.info("请求参数[优惠券]=>uId:{} commodity:{} bizId:{} extMap:{}",uId,commodityId,bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]:{}",JSON.toJSON(baseResult));
    }
}
