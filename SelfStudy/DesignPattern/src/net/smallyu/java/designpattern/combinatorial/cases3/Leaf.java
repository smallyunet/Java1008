package net.smallyu.java.designpattern.combinatorial.cases3;

import java.util.ArrayList;

public class Leaf extends Component {
    @Override
    @Deprecated
    public void add(Component component) throws UnsupportedOperationException {
        // 空实现
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public void remove(Component component) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public ArrayList<Component> getChildren() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
