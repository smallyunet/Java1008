package net.smallyu.java.designpattern.adapter.cases3;

import java.util.HashMap;
import java.util.Map;

public class OuterUserHomeInfo implements IOuterUserBaseInfo {
    @Override
    public Map getUserBaseInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumber", "员工的家庭电话是……");
        homeInfo.put("homeAddress","员工的家庭地址是……");
        return homeInfo;
    }
}
