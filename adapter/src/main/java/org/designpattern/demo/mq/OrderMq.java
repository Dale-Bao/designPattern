package org.designpattern.demo.mq;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.Date;

/**
 * @author xueneng on 2020/11/25.
 *         Description:
 */
@Data
public class OrderMq {
    /**
     * 用户id
     */
    private String uId;
    /**
     * 商品
     */
    private String sku;
    /**
     * 订单id
     */
    private String orderId;
    /**
     * 下单时间
     */
    private Date createOrderTime;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
