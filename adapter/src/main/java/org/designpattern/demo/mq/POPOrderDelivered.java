package org.designpattern.demo.mq;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author xueneng on 2020/11/25.
 *         Description:
 */
@Data
public class POPOrderDelivered {
    /**
     * 用户id
     */
    private String uId;
    /**
     * 订单号
     */
    private String orderId;
    /**
     * 下单时间
     */
    private Date orderTime;
    /**
     * 商品
     */
    private String sku;
    /**
     * 商品名称
     */
    private String skuName;
    /**
     * 金额
     */
    private BigDecimal decimal;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
