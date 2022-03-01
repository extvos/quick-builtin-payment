package plus.extvos.builtin.payment.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author shenmc
 */
@ApiModel("Basic Bill of Payment")
public class Bill {
    @ApiModelProperty("Payment provider")
    private String provider;

    @ApiModelProperty("Payment reference number")
    private Serializable refNum;

    @ApiModelProperty("Subject of payment bill")
    private String subject;

}
