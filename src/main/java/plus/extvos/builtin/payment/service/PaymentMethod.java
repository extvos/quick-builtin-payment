package plus.extvos.builtin.payment.service;

import plus.extvos.builtin.payment.dto.PrepayBill;

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
     * @param serialNum
     */
    void billCancel(String serialNum);

    /**
     * @param serialNum
     */
    void billClose(String serialNum);

    /**
     * @param serialNum
     * @param fee
     * @param reason
     */
    void billRefund(String serialNum, int fee, String reason);

    /**
     * @param serialNum
     */
    void billQuery(String serialNum);

    /**
     * @param request
     * @param response
     */
    void notifyHandle(HttpServletRequest request, HttpServletResponse response);
}
