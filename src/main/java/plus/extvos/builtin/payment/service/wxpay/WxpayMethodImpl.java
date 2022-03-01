package plus.extvos.builtin.payment.service.wxpay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import plus.extvos.builtin.payment.config.PaymentConfig;
import plus.extvos.builtin.payment.dto.PrepayBill;
import plus.extvos.builtin.payment.service.PaymentMethod;
import plus.extvos.builtin.payment.service.wxpay.config.WxpayConfig;
import plus.extvos.builtin.payment.service.wxpay.sdk.WXPay;
import plus.extvos.common.Result;
import plus.extvos.common.exception.ResultException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author shenmc
 */
@Service
public class WxpayMethodImpl implements PaymentMethod {

    private static final String SLUG = "wxpay";
    private static final String NAME = "微信支付";
    private static final String DESC = "微信支付";


    /**
     * slug
     *
     * @return String of slug
     */
    @Override
    public String slug() {
        return SLUG;
    }

    /**
     * name
     *
     * @return String of name
     */
    @Override
    public String name() {
        return NAME;
    }

    /**
     * description
     *
     * @return String of description
     */
    @Override
    public String description() {
        return DESC;
    }

    /**
     * logo
     *
     * @return url of logo
     */
    @Override
    public String logo() {
        return null;
    }

    @Autowired
    private PaymentConfig paymentConfig;

    @Bean
    public WXPay makeWXPay(WxpayConfig cfg) throws Exception {
        return new WXPay(cfg, paymentConfig.getNotifyUrl() + "/_builtin/payment/" + SLUG + "/notify", true, cfg.getSandbox());
    }

    /**
     * Create payment
     *
     * @param subject of payment order
     * @param refId   of original order Id
     * @param fee     in cent unit
     * @return PrepayResult
     */
    @Override
    public PrepayBill pay(String subject, String refId, int fee) {
        return null;
    }

    /**
     * @param serialNum string
     */
    @Override
    public void cancelBill(String serialNum) {

    }

    /**
     * @param serialNum string
     */
    @Override
    public void closeBill(String serialNum) {

    }

    /**
     * @param serialNum string
     * @param fee       integer
     * @param reason    string
     */
    @Override
    public void refundBill(String serialNum, int fee, String reason) {

    }

    /**
     * @param serialNum string
     */
    @Override
    public void queryBill(String serialNum) {

    }

    /**
     * @param request  http request
     * @param response http response
     */
    @Override
    public Result<?> notifyHandle(HttpServletRequest request, HttpServletResponse response) throws ResultException {
        throw ResultException.notImplemented();
    }
}
