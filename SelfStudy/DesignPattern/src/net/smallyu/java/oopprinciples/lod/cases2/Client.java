package net.smallyu.java.oopprinciples.lod.cases2;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // 产生一个女生群体
        List<Girl> listGirls = new ArrayList<Girl>();
        // 初始化女生
        for (int i = 0; i < 20; i++) {
            listGirls.add(new Girl());
        }
        Teacher teacher = new Teacher();
        // 老师发布命令
        teacher.command(new GroupLeader(listGirls));
    }
}
