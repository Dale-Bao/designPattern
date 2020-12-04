package com.pattern.pay;

import lombok.Getter;

/**
 * @author xueneng on 2020/11/30.
 *         Description:
 */
public enum Topic {
    LOG(1,"log11");
    public final int value;
    @Getter
    public final String name;

    Topic(int value, String name) {
        this.value = value;
        this.name = name;
    }

}
