package plus.extvos.builtin.payment.service.wxpay;

import plus.extvos.builtin.payment.dto.PrepayBill;
import plus.extvos.builtin.payment.service.PaymentMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author shenmc
 */
public class WxpayMethodImpl implements PaymentMethod {
    /**
     * slug
     *
     * @return String of slug
     */
    @Override
    public String slug() {
        return null;
    }

    /**
     * name
     *
     * @return String of name
     */
    @Override
    public String name() {
        return null;
    }

    /**
     * description
     *
     * @return String of description
     */
    @Override
    public String description() {
        return null;
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
    public void billCancel(String serialNum) {

    }

    /**
     * @param serialNum string
     */
    @Override
    public void billClose(String serialNum) {

    }

    /**
     * @param serialNum string
     * @param fee integer
     * @param reason string
     */
    @Override
    public void billRefund(String serialNum, int fee, String reason) {

    }

    /**
     * @param serialNum string
     */
    @Override
    public void billQuery(String serialNum) {

    }

    /**
     * @param request http request
     * @param response http response
     */
    @Override
    public void notifyHandle(HttpServletRequest request, HttpServletResponse response) {

    }
}
