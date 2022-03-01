package plus.extvos.builtin.payment.service.alipay;

import org.springframework.stereotype.Service;
import plus.extvos.builtin.payment.dto.PrepayBill;
import plus.extvos.builtin.payment.service.PaymentMethod;
import plus.extvos.common.Result;
import plus.extvos.common.exception.ResultException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author shenmc
 */
@Service
public class AlipayMethodImpl implements PaymentMethod {

    private static final String SLUG = "alipay";
    private static final String NAME = "支付宝";
    private static final String DESC = "支付宝";


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
