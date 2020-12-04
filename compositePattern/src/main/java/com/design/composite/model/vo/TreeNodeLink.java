package com.design.composite.model.vo;

import lombok.Data;

/**
 * @author xueneng on 2020/12/2.
 * Description:
 */
@Data
public class TreeNodeLink {
    /**
     * 节点from
     */
    private Long nodeIdFrom;
    /**
     * 节点to
     */
    private Long nodeIdTo;
    /**
     * 限定类型 枚举
     * 1:= 2:> 3:< 4:>= 5:<= 6:enum[枚举范围]
     */
    private Integer ruleLimitType;
    /**
     * 限定值
     */
    private String ruleLimitValue;
}
