package service.couponService;

import result.BaseResult;

/**
 * @author xueneng on 2020/10/30.
 *         Description:
 */
public class CouponService {
    public BaseResult sendCoupon(String uId, String couponNumber , String uuid){
        System.out.println("模拟发放优惠券一张："+uId+","+couponNumber+","+uuid);
        return new BaseResult("0000","发放成功");
    }
}
