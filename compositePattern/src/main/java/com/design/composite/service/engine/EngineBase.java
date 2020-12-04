package com.design.composite.service.engine;

import com.design.composite.model.aggregate.TreeRich;
import com.design.composite.model.vo.EngineResult;
import com.design.composite.model.vo.TreeNode;
import com.design.composite.model.vo.TreeRoot;
import com.design.composite.service.logic.LogicFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author xueneng on 2020/12/2.
 * Description:
 */
public abstract class EngineBase extends EngineConfig implements IEngine {
    private Logger logger = LoggerFactory.getLogger(EngineBase.class);

    public abstract EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter);

    protected TreeNode engineDecisionMaker(TreeRich treeRich, Long treeId, String userId, Map<String, String> decisionMatter) {
        TreeRoot treeRoot = treeRich.getTreeRoot();
        Map<Long,TreeNode> treeNodeMap = treeRich.getTreeNodeMap();
        //规则树根id
        Long rootNodeId = treeRoot.getTreeRootNodeId();
        TreeNode treeNode = treeNodeMap.get(rootNodeId);
        //节点类型[NodeType] 1:叶子 2:果实
        while(treeNode.getNodeType().equals(1)){
            String ruleKey = treeNode.getRuleKey();
            LogicFilter logicFilter = logicFilterMap.get(ruleKey);
            String matterValue = logicFilter.matterValue(treeId,userId,decisionMatter);
            Long nextNode = logicFilter.filter(matterValue,treeNode.getTreeNodeLinkList());
            treeNode = treeNodeMap.get(nextNode);
            logger.info("决策树引擎=>{} userId:{},treeId:{},treeNode:{},ruleKey:{},matterKey:{}",treeRoot.getTreeName(),userId,treeId,treeNode.getTreeNodeId(),ruleKey,matterValue);
        }
        return treeNode;
    }
}
