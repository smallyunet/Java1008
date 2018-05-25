package net.smallyu.java.oopprinciples.lod.cases1;

public class Client {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        // 老师发布命令
        teacher.command(new GroupLeader());
    }
}
