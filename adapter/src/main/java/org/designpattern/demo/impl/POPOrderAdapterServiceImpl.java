package org.designpattern.demo.impl;


import org.designpattern.demo.adapter.OrderAdapterService;
import org.designpattern.demo.service.POPOrderService;

public class POPOrderAdapterServiceImpl implements OrderAdapterService {

    private POPOrderService popOrderService = new POPOrderService();

    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }

}
