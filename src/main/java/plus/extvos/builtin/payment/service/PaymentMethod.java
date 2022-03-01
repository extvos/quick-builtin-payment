package plus.extvos.builtin.payment.service;

import plus.extvos.builtin.payment.dto.PrepayBill;
import plus.extvos.common.Result;
import plus.extvos.common.exception.ResultException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author shenmc
 */
public interface PaymentMethod {

    /**
     * slug
     *
     * @return String of slug
     */
    String slug();

    /**
     * name
     *
     * @return String of name
     */
    String name();

    /**
     * description
     *
     * @return String of description
     */
    String description();

    /**
     * logo
     *
     * @return url of logo
     */
    String logo();

    /**
     * Create payment
     *
     * @param subject of payment order
     * @param refId   of original order Id
     * @param fee     in cent unit
     * @return PrepayResult
     */
    PrepayBill pay(String subject, String refId, int fee);

    /**
     * Cancel payment bill
     *
     * @param serialNum string
     */
    void cancelBill(String serialNum);

    /**
     * Close payment bill
     *
     * @param serialNum string
     */
    void closeBill(String serialNum);

    /**
     * Refund payment bill
     *
     * @param serialNum string
     * @param fee       integer
     * @param reason    string
     */
    void refundBill(String serialNum, int fee, String reason);

    /**
     * Query payment bill
     *
     * @param serialNum string
     */
    void queryBill(String serialNum);

    /**
     * Payment service notify handler
     *
     * @param request  http request
     * @param response http response
     */
    Result<?> notifyHandle(HttpServletRequest request, HttpServletResponse response) throws ResultException;
}
