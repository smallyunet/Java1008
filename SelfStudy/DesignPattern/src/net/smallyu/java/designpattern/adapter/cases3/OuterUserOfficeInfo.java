package net.smallyu.java.designpattern.adapter.cases3;

import java.util.HashMap;
import java.util.Map;

public class OuterUserOfficeInfo implements IOuterUserBaseInfo {
    @Override
    public Map getUserBaseInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition", "这个人的职位是……");
        officeInfo.put("officeTelNumber","员工的办公电话是……");
        return officeInfo;
    }
}
