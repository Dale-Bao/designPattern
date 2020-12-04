package com.design.composite.model.vo;

import lombok.Data;

/**
 * @author xueneng on 2020/12/2.
 * Description:
 */
@Data
public class TreeRoot {
    /**
     * 规则树id
     */
    private Long treeId;
    /**
     * 规则树根id
     */
    private Long treeRootNodeId;
    /**
     * 规则树名称
     */
    private String treeName;
}
