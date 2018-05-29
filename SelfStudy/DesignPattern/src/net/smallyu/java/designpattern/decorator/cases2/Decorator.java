package net.smallyu.java.designpattern.decorator.cases2;

public abstract class Decorator extends Component {
    private Component component = null;
    // 通过构造函数传递被修饰者
    public Decorator(Component _component) {
        this.component = _component;
    }
    // 委托给被修饰者
    public void operate() {
        this.component.operate();
    }
}
