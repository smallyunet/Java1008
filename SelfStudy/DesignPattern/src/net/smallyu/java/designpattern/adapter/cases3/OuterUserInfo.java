package net.smallyu.java.designpattern.adapter.cases3;

import net.smallyu.java.designpattern.adapter.cases1.IUserInfo;
import sun.nio.ch.IOUtil;

import java.util.Map;

public class OuterUserInfo implements IUserInfo {
    // 源目标对象
    private IOuterUserBaseInfo baseInfo = null;
    private IOuterUserHomeInfo homeInfo = null;
    private IOuterUserOfficeInfo officeInfo = null;
    // 数据处理
    private Map baseMap = null;
    private Map homeMap = null;
    private Map officeMap = null;

    public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
        this.baseInfo = baseInfo;
        this.homeInfo = homeInfo;
        this.officeInfo = officeInfo;
        this.baseMap = baseMap;
        this.homeMap = homeMap;
        this.officeMap = officeMap;
    }

    @Override
    public String getUserName() {
        String userName = (String)this.baseMap.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String)this.homeMap.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String)this.baseMap.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String)this.officeMap.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = (String)this.officeMap.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String)this.homeMap.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
}
