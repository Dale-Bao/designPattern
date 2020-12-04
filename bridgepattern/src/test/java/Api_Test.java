import com.pattern.pay.Topic;
import com.pattern.pay.channel.AliPay;
import com.pattern.pay.channel.Pay;
import com.pattern.pay.channel.WxPay;
import com.pattern.pay.mode.PayFaceMode;
import com.pattern.pay.mode.PayFingerprintMode;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author xueneng on 2020/11/30.
 *         Description:
 */
public class Api_Test {
    @Test
    public void test_pay(){
        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        WxPay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_12223233","2222",new BigDecimal(200));
        wxPay.getEnumValue(Topic.LOG);
        System.out.println("\r\n模拟测试场景；支付宝支付，指纹方式");
        Pay aliPay = new AliPay(new PayFingerprintMode());
        aliPay.transfer("jiwx22423","134432",new BigDecimal(300));

    }
}
