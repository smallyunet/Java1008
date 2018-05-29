package net.smallyu.java.designpattern.decorator.cases2;

/**
 * J具体构件
 */
public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("do something");
    }
}
