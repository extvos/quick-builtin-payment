package plus.extvos.builtin.payment.service.wxpay.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author shenmc
 */
@Configuration
@ConfigurationProperties(prefix = "quick.payment.wxpay")
public class WxpayConfig {
}
