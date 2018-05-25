package net.smallyu.java.oopprinciples.lod.cases2;


public class Teacher {
    // 老师对学生发布命令，清一下女生
    public void command(GroupLeader groupLeader) {
        // 告诉体育委员开始清查任务
        groupLeader.countGirls();
    }
}
