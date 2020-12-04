package org.designpattern.demo.impl;

import org.designpattern.demo.adapter.OrderAdapterService;
import org.designpattern.demo.service.OrderService;

public class InsideOrderService implements OrderAdapterService {

    private OrderService orderService = new OrderService();

    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }

}
