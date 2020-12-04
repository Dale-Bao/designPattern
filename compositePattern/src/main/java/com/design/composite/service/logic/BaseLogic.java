package com.design.composite.service.logic;

import com.design.composite.model.vo.TreeNodeLink;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;

/**
 * @author xueneng on 2020/12/2.
 * Description:
 */
public class BaseLogic implements LogicFilter{
    public Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkList) {
        for (TreeNodeLink treeNodeLink : treeNodeLinkList) {
            if(decisionLogic(matterValue,treeNodeLink)){
                return treeNodeLink.getNodeIdTo();
            }
        }
        return 0L;
    }

    private boolean decisionLogic(String matterValue, @NotNull TreeNodeLink treeNodeLink) {
        switch (treeNodeLink.getRuleLimitType()){
            case 1:
                return matterValue.equals(treeNodeLink.getRuleLimitValue());
            case 2:
                return Double.parseDouble(matterValue) > Double.parseDouble(treeNodeLink.getRuleLimitValue());
            case 3:
                return Double.parseDouble(matterValue) < Double.parseDouble(treeNodeLink.getRuleLimitValue());
            case 4:
                return Double.parseDouble(matterValue) <= Double.parseDouble(treeNodeLink.getRuleLimitValue());
            case 5:
                return Double.parseDouble(matterValue) >= Double.parseDouble(treeNodeLink.getRuleLimitValue());
            default:
                return false;
        }
    }

    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return null;
    }
}
