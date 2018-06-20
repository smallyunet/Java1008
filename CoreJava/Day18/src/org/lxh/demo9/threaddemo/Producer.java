package org.lxh.demo9.threaddemo;

/**
 * 生产者
 */
public class Producer implements Runnable {
    private Info info = null;
    public Producer(Info info) {
        this.info = info;
    }
    @Override
    public void run() {
        boolean flag = false;
        for (int i = 0; i < 50; i++) {
            if(flag) {
                this.info.set("李兴华", "JAVA讲师");
//                this.info.setName("李兴华");
//                try {
//                    Thread.sleep(90);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                this.info.setContent("JAVA讲师");
                flag = false;
            } else {
                this.info.set("mldn", "www.mldnjava.cn");
//                this.info.setName("mldn");
//                try {
//                    Thread.sleep(90);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                this.info.setContent("www.mldn.java.cn");
                flag = true;
            }
        }
    }
}
