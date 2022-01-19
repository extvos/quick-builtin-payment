package plus.extvos.builtin.payment.dto;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shenmc
 */
public class PrepayBill {
    private String serialNum;
    private String codeUrl;
    private Map<String, Object> extra;

    public PrepayBill() {

    }

    public PrepayBill(String serialNum, String codeUrl) {
        this(serialNum, codeUrl, null);
    }

    public PrepayBill(String serialNum, String codeUrl, Map<String, Object> extra) {
        this.serialNum = serialNum;
        this.codeUrl = codeUrl;
        this.extra = extra;
    }

    public Object get(String k) {
        if (null == extra) {
            return null;
        }
        return extra.get(k);
    }

    public Object put(String k, Object v) {
        if (null == extra) {
            extra = new HashMap<String, Object>();
        }
        return extra.put(k, v);
    }

    public Object remove(String k) {
        if (null == extra) {
            return null;
        }
        return extra.remove(k);
    }

    public void putAll(Map<String, Object> m) {
        if (null == extra) {
            extra = new HashMap<String, Object>(m.size());
        }
        extra.putAll(m);
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getCodeUrl() {
        return codeUrl;
    }

    public void setCodeUrl(String codeUrl) {
        this.codeUrl = codeUrl;
    }

    public Map<String, Object> getExtra() {
        return extra;
    }

    public void setExtra(Map<String, Object> extra) {
        this.extra = extra;
    }
}
