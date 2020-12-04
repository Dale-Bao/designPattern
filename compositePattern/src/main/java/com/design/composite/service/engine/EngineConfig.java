package com.design.composite.service.engine;

import com.design.composite.service.logic.LogicFilter;
import com.design.composite.service.logic.impl.UserAgeFilter;
import com.design.composite.service.logic.impl.UserGenderFilter;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xueneng on 2020/12/2.
 * Description:
 */
public class EngineConfig {
    @Getter
    @Setter
    static Map<String, LogicFilter> logicFilterMap;
    static{
        logicFilterMap = new ConcurrentHashMap<String, LogicFilter>();
        logicFilterMap.put("userAge",new UserAgeFilter());
        logicFilterMap.put("userGender",new UserGenderFilter());
    }
}
