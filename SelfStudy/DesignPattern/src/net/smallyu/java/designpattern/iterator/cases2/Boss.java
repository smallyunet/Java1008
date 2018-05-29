package net.smallyu.java.designpattern.iterator.cases2;

public class Boss {
    public static void main(String[] args) {
        IProject project = new Project();
        project.add("星球",10, 10000);
        project.add("星球",10, 10000);
        project.add("星球",10, 10000);
        for(int i = 4; i < 104; i++) {
            project.add("第" + i + "个项目", i * 5, i * 100000);
        }
        IProjectIterator projectIterator = project.iterator();
        while(projectIterator.hasNext()){
            IProject p = (IProject)projectIterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
