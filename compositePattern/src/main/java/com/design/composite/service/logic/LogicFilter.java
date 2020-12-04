package com.design.composite.service.logic;

import com.design.composite.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @author xueneng on 2020/12/2.
 * Description:
 */
public interface LogicFilter {
    /**
     * 逻辑决策器
     * @param matterValue 决策值
     * @param treeNodeLinkList 决策节点
     * @return 下一个节点id
     */
    Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkList);

    /**
     * 获取决策值
     * @param treeId 节点id
     * @param userId 用户id
     * @param decisionMatter 决策物料
     * @return 决策值
     */
    String matterValue(Long treeId, String userId, Map<String,String> decisionMatter);
}
