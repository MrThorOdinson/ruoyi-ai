package com.xmzs.system.domain.bo;

import com.xmzs.common.core.validate.AddGroup;
import com.xmzs.common.core.validate.EditGroup;
import com.xmzs.system.domain.PaymentOrders;
import com.xmzs.common.mybatis.core.domain.BaseEntity;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import lombok.EqualsAndHashCode;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;

/**
 * 支付订单业务对象 payment_orders
 *
 * @author Lion Li
 * @date 2023-12-29
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AutoMapper(target = PaymentOrders.class, reverseConvertGenerate = false)
public class PaymentOrdersBo extends BaseEntity {

    /**
     * 主键
     */
    @NotNull(message = "主键不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 订单编号
     */
    @NotBlank(message = "订单编号不能为空", groups = { AddGroup.class, EditGroup.class })
    private String orderNo;

    /**
     * 订单名称
     */
    @NotBlank(message = "订单名称不能为空", groups = { AddGroup.class, EditGroup.class })
    private String orderName;

    /**
     * 金额
     */
    @NotNull(message = "金额不能为空", groups = { AddGroup.class, EditGroup.class })
    private BigDecimal amount;

    /**
     * 支付状态
     */
    @NotBlank(message = "支付状态不能为空", groups = { AddGroup.class, EditGroup.class })
    private String paymentStatus;

    /**
     * 支付方式
     */
    @NotBlank(message = "支付方式不能为空", groups = { AddGroup.class, EditGroup.class })
    private String paymentMethod;

    /**
     * 用户ID
     */
    @NotNull(message = "用户ID不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long userId;

    /**
     * 备注
     */
    @NotBlank(message = "备注不能为空", groups = { AddGroup.class, EditGroup.class })
    private String remark;


}
