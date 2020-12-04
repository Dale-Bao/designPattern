package org.designpattern.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xueneng on 2020/11/25.
 *         Description:
 */
public class OrderService {
    private Logger logger = LoggerFactory.getLogger(OrderService.class);
    public long queryUserOrderCount(String userId){
        logger.info("自营商家，查询用户的订单是否为首单：{}", userId);
        return 10L;
    }
}
