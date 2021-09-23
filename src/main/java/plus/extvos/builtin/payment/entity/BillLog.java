package plus.extvos.builtin.payment.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

/**
 * @author shenmc
 */
@TableName("builtin_payment_bill_logs")
public class BillLog {
    @TableId(type = IdType.AUTO)
    @TableField(fill = FieldFill.INSERT)
    private Long id;

    @TableField(value = "bill_id")
    private Long billId;

    @TableField(value = "status")
    private Short status;

    @TableField(value = "provider")
    private String provider;

    @TableField(value = "ref_id")
    private String refId;

    @TableField(value = "ret")
    private String ret;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    @TableField(value = "created")
    private Timestamp created;

}
