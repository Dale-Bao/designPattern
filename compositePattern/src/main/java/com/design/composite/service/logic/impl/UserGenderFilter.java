package com.design.composite.service.logic.impl;

import com.design.composite.service.logic.BaseLogic;

import java.util.Map;

/**
 * @author xueneng on 2020/12/2.
 * Description:
 */
public class UserGenderFilter extends BaseLogic {

    @Override
    public String matterValue(Long treeId, String userId, Map<String,String> decisionMatter){
        return decisionMatter.get("gender");
    }
}
