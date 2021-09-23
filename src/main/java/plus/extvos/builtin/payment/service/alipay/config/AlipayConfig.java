package plus.extvos.builtin.payment.service.alipay.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author shenmc
 */
@Configuration
@ConfigurationProperties(prefix = "quick.payment.alipay")
public class AlipayConfig {
}
