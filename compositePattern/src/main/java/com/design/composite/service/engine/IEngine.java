package com.design.composite.service.engine;

import com.design.composite.model.aggregate.TreeRich;
import com.design.composite.model.vo.EngineResult;

import java.util.Map;

/**
 * @author xueneng on 2020/12/2.
 * Description:
 */
public interface IEngine {
    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String,String> decisionMatter);
}
