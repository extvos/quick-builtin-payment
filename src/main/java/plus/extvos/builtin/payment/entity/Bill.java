package plus.extvos.builtin.payment.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author shenmc
 */
@TableName("builtin_payment_bills")
public class Bill implements Serializable {

    @TableId(type = IdType.AUTO)
    @TableField(fill = FieldFill.INSERT)
    private Long id;

    @TableField(value = "subject")
    private String subject;


    @TableField(value = "amount")
    private Integer amount;


    @TableField(value = "status")
    private Short status;

    @TableField(value = "provider")
    private String provider;

    @TableField(value = "ref_id")
    private String refId;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    @TableField(value = "created")
    private Timestamp created;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    @TableField(value = "updated")
    private Timestamp updated;
}
