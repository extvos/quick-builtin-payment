package plus.extvos.builtin.payment.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author shenmc
 */
@Configuration
@ConfigurationProperties(prefix = "quick.payment.base")
public class PaymentConfig {
}
