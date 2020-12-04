package org.designpattern.demo.adapter;

import lombok.Data;

import java.util.Date;

/**
 * @author xueneng on 2020/11/25.
 *         Description:
 */
@Data
public class RebateInfo {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 业务id
     */
    private String bizId;
    /**
     * 业务时间
     */
    private Date bizTime;
    /**
     * 业务描述
     */
    private String desc;

    public void setBizTime(String bizTime) {
        this.bizTime = new Date(Long.parseLong("1591077840669"));
    }

}
