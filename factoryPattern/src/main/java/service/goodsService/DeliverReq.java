package service.goodsService;

import lombok.Data;

/**
 * @author xueneng on 2020/10/30.
 *         Description:
 */
@Data
public class DeliverReq {
    private String userName;
    private String userPhone;
    private String sku;
    private String orderId;
    private String consigneeUserName;
    private String consigneeUserPhone;
    private String consigneeUserAddress;
}
