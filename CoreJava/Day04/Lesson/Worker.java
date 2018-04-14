/*
    英才汇硕信息科技有限公司 版权说明
*/
package com.ychs168.corejava;

import java.util.Date;

/**
    工人实体类（类的功能说明）
    @author smallyu
    @version 1.0 2018-04-14
*/
public class Worker {
    /** 工人姓名（对属性做说明） */
    String workerName;
    /** 工人性别 */
    String sex;

    public Worker() {

    }

    public Worker(String workerName, String sex) {
        this.workerName = workerName;
        this.sex = sex;
    }
    /**
        完成说话功能（方法的作用、功能）
        @param words 要说的话
        @return 最终说的话
     */
    public String speak(String words) {
        return "说：" + words;
    }
    /**
     * 完成测试功能
     */
    public void test() {}
}
