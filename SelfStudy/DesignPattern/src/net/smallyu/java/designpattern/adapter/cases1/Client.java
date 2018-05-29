package net.smallyu.java.designpattern.adapter.cases1;

public class Client {
    public static void main(String[] args) {
        // 没有连接时
        IUserInfo youngGirl = new OuterUserInfo();
        // 查101个
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }
}
