package test;

import design.StoreFactory;
import org.junit.Test;
import store.ICommodity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xueneng on 2020/10/30.
 *         Description:
 */
public class ApiTest {
    @Test
    public void test_commodity() {
        StoreFactory storeFactory = new StoreFactory();

        //优惠券
        ICommodity commodity_1 = storeFactory.getCommodityService(1);
        commodity_1.sendCommodity("10001", "EGM156421545", "74864512",null);
        // 2. 实物商品
        ICommodity commodityService_2 = storeFactory.getCommodityService(2);
        Map<String, String> extMap = new HashMap<String, String>();
        extMap.put("consigneeUserName", "谢飞机");
        extMap.put("consigneeUserPhone", "15200292123");
        extMap.put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");

        commodityService_2.sendCommodity("10001", "9820198721311", "1023000020112221113", new HashMap<String, String>() {{
            put("consigneeUserName", "谢飞机");
            put("consigneeUserPhone", "15200292123");
            put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");
        }});
    }
}
