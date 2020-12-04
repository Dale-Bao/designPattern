package com.design.composite.model.vo;

import lombok.Data;

import java.util.List;

/**
 * @author xueneng on 2020/12/2.
 * Description:
 */
@Data
public class TreeNode {
    /**
     * 规则树id
     */
    private Long treeId;
    /**
     * 规则树节点id
     */
    private Long treeNodeId;
    /**
     * 节点类型 1子叶 2果实
     */
    private Integer nodeType;
    /**
     * 节点值[nodeType=2]:果实值
     */
    private String nodeValue;
    /**
     * 规则key
     */
    private String ruleKey;
    /**
     * 规则描述
     */
    private String ruleDesc;
    /**
     * 节点链路
     */
    private List<TreeNodeLink> treeNodeLinkList;
}
