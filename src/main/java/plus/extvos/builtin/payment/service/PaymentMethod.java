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
     * @param serialNum string
     */
    void billCancel(String serialNum);

    /**
     * @param serialNum string
     */
    void billClose(String serialNum);

    /**
     * @param serialNum string
     * @param fee integer
     * @param reason string
     */
    void billRefund(String serialNum, int fee, String reason);

    /**
     * @param serialNum string
     */
    void billQuery(String serialNum);

    /**
     * @param request http request
     * @param response http response
     */
    void notifyHandle(HttpServletRequest request, HttpServletResponse response);
}
