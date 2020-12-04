package com.pattern.pay.channel;

import com.pattern.pay.Topic;
import com.pattern.pay.mode.IPayMode;

import java.math.BigDecimal;

/**
 * @author xueneng on 2020/11/30.
 *         Description:
 */
public class WxPay extends Pay {
    public WxPay(IPayMode payMode) {
        super(payMode);
    }

    public String transfer(String uId, String tradeId, BigDecimal amount) {
        logger.info("模拟微信渠道支付划账开始。uId:{},tradeId:{},amount:{}", uId, tradeId, amount);
        boolean security = payMode.security(uId);
        logger.info("模拟微信渠道支付风控校验。uId:{},tradeId:{},amount:{}", uId, tradeId, amount);
        if (!security) {
            logger.info("模拟微信渠道支付划账拦截。uId:{},tradeId:{},amount:{}", uId, tradeId, amount);
            return "0001";
        }
        logger.info("模拟微信渠道支付划账成功。uId:{},tradeId:{},amount:{}", uId, tradeId, amount);
        return "0000";

    }

    public void getEnumValue(Topic topic) {
        System.out.println(topic.getName());
    }
}
