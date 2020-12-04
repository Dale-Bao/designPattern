package com.pattern.pay.channel;

import com.pattern.pay.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author xueneng on 2020/11/30.
 *         Description:定义支付的抽象类
 */
public abstract class Pay {
    protected Logger logger = LoggerFactory.getLogger(Pay.class);
    protected IPayMode payMode;
    public Pay(IPayMode payMode){
        this.payMode = payMode;
    }
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
