package plus.extvos.builtin.payment.service.wxpay.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import plus.extvos.builtin.payment.service.wxpay.sdk.IWXPayDomain;
import plus.extvos.builtin.payment.service.wxpay.sdk.WXPayConfig;

import java.io.InputStream;

/**
 * @author shenmc
 */
@Configuration
//@ConfigurationProperties(prefix = "quick.payment.wxpay")
public class WxpayConfig extends WXPayConfig {
    @Value("${quick.payment.wxpay.api-key}")
    private String apiKey;

    @Value("${quick.payment.wxpay.app-id}")
    private String appId;

    @Value("${quick.payment.wxpay.mch-id}")
    private String mchId;

    @Value("${quick.payment.wxpay.sandbox:false}")
    private Boolean sandbox;

    @Value("${quick.payment.wxpay.country:1}")
    private Integer country;

    public String getApiKey() {
        return apiKey;
    }

    public String getAppId() {
        return appId;
    }

    public String getMchId() {
        return mchId;
    }

    public Boolean getSandbox() {
        return sandbox;
    }

    public Integer getCountry() {
        return country;
    }

    /**
     * 获取 App ID
     *
     * @return App ID
     */
    @Override
    protected String getAppID() {
        return appId;
    }

    ;


    /**
     * 获取 Mch ID
     *
     * @return Mch ID
     */
    @Override
    protected String getMchID() {
        return mchId;
    }


    /**
     * 获取 API 密钥
     *
     * @return API密钥
     */
    @Override
    protected String getKey() {
        return apiKey;
    }


    /**
     * 获取商户证书内容
     *
     * @return 商户证书内容
     */
    @Override
    protected InputStream getCertStream() {
        return null;
    }

    /**
     * 获取WXPayDomain, 用于多域名容灾自动切换
     *
     * @return
     */
    @Override
    protected IWXPayDomain getWXPayDomain() {
        return null;
    }

    /**
     * HTTP(S) 连接超时时间，单位毫秒
     *
     * @return
     */
    @Override
    public int getHttpConnectTimeoutMs() {
        return super.getHttpConnectTimeoutMs();
    }

    /**
     * HTTP(S) 读数据超时时间，单位毫秒
     *
     * @return
     */
    @Override
    public int getHttpReadTimeoutMs() {
        return super.getHttpReadTimeoutMs();
    }

    /**
     * 是否自动上报。
     * 若要关闭自动上报，子类中实现该函数返回 false 即可。
     *
     * @return
     */
    @Override
    public boolean shouldAutoReport() {
        return super.shouldAutoReport();
    }

    /**
     * 进行健康上报的线程的数量
     *
     * @return
     */
    @Override
    public int getReportWorkerNum() {
        return super.getReportWorkerNum();
    }

    /**
     * 健康上报缓存消息的最大数量。会有线程去独立上报
     * 粗略计算：加入一条消息200B，10000消息占用空间 2000 KB，约为2MB，可以接受
     *
     * @return
     */
    @Override
    public int getReportQueueMaxSize() {
        return super.getReportQueueMaxSize();
    }

    /**
     * 批量上报，一次最多上报多个数据
     *
     * @return
     */
    @Override
    public int getReportBatchSize() {
        return super.getReportBatchSize();
    }
}
