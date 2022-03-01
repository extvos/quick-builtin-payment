package plus.extvos.builtin.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import plus.extvos.builtin.payment.service.PaymentMethod;
import plus.extvos.common.Result;
import plus.extvos.common.exception.ResultException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shenmc
 */
@RestController
public class PaymentNotifyHandler {

    @Autowired
    private List<PaymentMethod> methods;

    private Map<String, PaymentMethod> methodsMap = null;

    synchronized PaymentMethod getMethod(String provider) {
        if (null == methodsMap) {
            methodsMap = new LinkedHashMap<String, PaymentMethod>(methods.size());
            for (PaymentMethod m : methods) {
                methodsMap.put(m.slug(), m);
            }
        }
        return methodsMap.get(provider);
    }

    @PostMapping("/_builtin/payment/{method}/notify")
    public Result<?> paymentNotification(@PathVariable String method, HttpServletRequest request, HttpServletResponse response) throws ResultException {
        PaymentMethod pm = getMethod(method);
        if (null == pm) {
            throw ResultException.badRequest("invalid method '" + method + "'");
        }
        return pm.notifyHandle(request, response);
    }
}
