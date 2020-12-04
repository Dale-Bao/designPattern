package com.pattern.pay.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xueneng on 2020/11/30.
 *         Description:
 */
public class PayFingerprintMode implements IPayMode {
    protected Logger logger = LoggerFactory.getLogger(PayFingerprintMode.class);
    public boolean security(String uId) {
        logger.info("指纹支付，风控校验指纹信息");
        return true;
    }
}
