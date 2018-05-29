package net.smallyu.java.designpattern.adapter.cases1;

public class UserInfo implements IUserInfo {

    @Override
    public String getUserName() {
        System.out.println("用户名……");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("家庭地址……");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("手机号……");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("办公电话……");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("工作岗位……");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("家庭电话……");
        return null;
    }
}
