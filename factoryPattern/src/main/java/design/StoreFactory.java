package design;

import store.ICommodity;
import store.impl.CouponCommodityService;
import store.impl.GoodsCommodityService;

/**
 * @author xueneng on 2020/10/30.
 *         Description:
 */
public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        switch (commodityType) {
            case 1:
                return new CouponCommodityService();
            case 2:
                return new GoodsCommodityService();
            default:
                throw new RuntimeException("不存在的是商品类型");
        }
    }
}
