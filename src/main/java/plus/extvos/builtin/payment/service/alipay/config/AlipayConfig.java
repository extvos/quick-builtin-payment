package plus.extvos.builtin.payment.service.alipay.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author shenmc
 */
@Configuration
//@ConfigurationProperties(prefix = "quick.payment.alipay")
public class AlipayConfig {

    @Value("${quick.payment.alipay.app-id}")
    private String appId;

    @Value("${quick.payment.alipay.private-key}")
    private String privateKey;

    @Value("${quick.payment.alipay.public-key}")
    private String publicKey;

    @Value("${quick.payment.alipay.sandbox:false}")
    private Boolean sandbox;

    public String getAppId() {
        return appId;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public Boolean getSandbox() {
        return sandbox;
    }
}
