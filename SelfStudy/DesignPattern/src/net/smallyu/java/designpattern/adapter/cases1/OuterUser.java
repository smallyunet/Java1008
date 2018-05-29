package net.smallyu.java.designpattern.adapter.cases1;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "这个员工叫混世魔王");
        baseInfoMap.put("mobileNumber", "这个员工的电话是……");
        return baseInfoMap;
    }

    @Override
    public Map getUserOffceInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumber", "家庭电话");
        homeInfo.put("hoemAddress", "家庭地址……");
        return homeInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition", "职位是……");
        officeInfo.put("officeTelNumber", "办公电话……");
        return officeInfo;
    }
}
