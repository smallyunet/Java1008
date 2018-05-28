package net.smallyu.java.designpattern.prototype.cases2;

public class PrototypeClass implements Cloneable {
    // 复写父类Object方法
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
