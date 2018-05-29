package net.smallyu.java.designpattern.iterator.cases1;

import java.util.ArrayList;

public class Boss {
    public static void main(String[] args) {
        // 定义一个list
        ArrayList<IProject> projectList = new ArrayList<IProject>();
        // 增加星球大战项目
        projectList.add(new Project("星球大战项目", 10,100000));
        projectList.add(new Project("扭转时空项目", 10,100000));
        projectList.add(new Project("超人改造项目", 10,100000));
        // 100
        for (int i = 4; i < 104; i++) {
            projectList.add(new Project("第" + i + "个项目", i * 5, i * 100000));
        }
        // 取出
        for(IProject project: projectList) {
            System.out.println(project.getProjectInfo());
        }
    }

}
