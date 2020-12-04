package com.design.composite.model.vo;

import lombok.Data;

/**
 * @author xueneng on 2020/12/2.
 * Description:
 */
@Data
public class EngineResult {
    /**
     * 执行结果
     */
    private boolean isSuccess;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 规则树id
     */
    private Long treeId;
    /**
     * 果实节点id
     */
    private Long nodeId;
    /**
     * 果实节点值
     */
    private String nodeValue;

    public EngineResult(String userId, Long treeId, Long nodeId, String nodeValue) {
        this.isSuccess = true;
        this.userId = userId;
        this.treeId = treeId;
        this.nodeId = nodeId;
        this.nodeValue = nodeValue;
    }
}
