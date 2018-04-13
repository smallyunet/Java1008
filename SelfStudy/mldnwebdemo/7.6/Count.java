package cn.mldn.lxh.demo;
public class Count{
    private int count = 0;
    public Count(){
        System.out.println("========一个新的Count对象=======");
    }
    public int getCount(){
        return ++this.count;
    }
}