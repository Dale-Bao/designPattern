package com.pattern.pay.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xueneng on 2020/11/30.
 *         Description:
 */
public class PayFaceMode implements IPayMode{
    protected Logger logger = LoggerFactory.getLogger(PayFaceMode.class);
    public boolean security(String uId) {
        logger.info("人脸支付，风控校验脸部识别");
        return true;
    }
}
