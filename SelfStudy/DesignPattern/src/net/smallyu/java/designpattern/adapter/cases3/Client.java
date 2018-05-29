package net.smallyu.java.designpattern.adapter.cases3;

import net.smallyu.java.designpattern.adapter.cases1.IUserInfo;

public class Client {
    public static void main(String[] args) {
        // 外系统的人员信息
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo = (IOuterUserHomeInfo) new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo= (IOuterUserOfficeInfo) new OuterUserOfficeInfo();
        // 传递三个对象
        IUserInfo youngirl = new OuterUserInfo(baseInfo,homeInfo, officeInfo);
        // 从数据库中查到101个
        for (int i = 0; i < 101; i++) {
            youngirl.getMobileNumber();
        }
    }
}
