package com.design.composite.service.engine.impl;

import com.design.composite.model.aggregate.TreeRich;
import com.design.composite.model.vo.EngineResult;
import com.design.composite.model.vo.TreeNode;
import com.design.composite.service.engine.EngineBase;

import java.util.Map;

/**
 * @author xueneng on 2020/12/3.
 * Description:
 */
public class TreeEngineHandle extends EngineBase {
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        //决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich,treeId,userId,decisionMatter);
        //决策结果
        return new EngineResult(userId,treeId,treeNode.getTreeNodeId(),treeNode.getNodeValue());
    }
}
