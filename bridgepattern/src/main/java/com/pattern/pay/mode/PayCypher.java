package com.pattern.pay.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xueneng on 2020/11/30.
 *         Description:
 */
public class PayCypher  implements  IPayMode{
    protected Logger logger = LoggerFactory.getLogger(PayCypher.class);
    public boolean security(String uId) {
        logger.info("密码支付，风控检验环境安全");
        return true;
    }
}
