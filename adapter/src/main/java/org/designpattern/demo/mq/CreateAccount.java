package org.designpattern.demo.mq;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.Date;

/**
 * @author xueneng on 2020/11/25.
 *         Description:
 */
@Data
public class CreateAccount {
    /**
     * 开户编号
     */
    private String number;
    /**
     * 开户地
     */
    private String address;
    /**
     * 开户时间
     */
    private Date accountDate;
    /**
     * 开户描述
     */
    private String desc;
    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
