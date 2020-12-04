package org.designpattern.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xueneng on 2020/11/25.
 *         Description:
 */
public class POPOrderService {
    private Logger logger = LoggerFactory.getLogger(POPOrderService.class);
    public boolean isFirstOrder(String uId){
        logger.info("POP商家，查询用户的订单是否为首单：{}",uId);
        return true;
    }
}
