package com.design.composite.model.aggregate;

import com.design.composite.model.vo.TreeNode;
import com.design.composite.model.vo.TreeRoot;
import lombok.Data;

import java.util.Map;

/**
 * @author xueneng on 2020/12/2.
 * Description:
 */
@Data
public class TreeRich {
    /**
     * 树根信息
     */
    private TreeRoot treeRoot;
    /**
     * 树节点id->子节点
     */
    private Map<Long, TreeNode> treeNodeMap;
    public TreeRich(TreeRoot treeRoot,Map<Long,TreeNode> treeNodeMap){
        this.treeRoot = treeRoot;
        this.treeNodeMap = treeNodeMap;
    }
}
