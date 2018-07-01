package org.lxh.demo10.generics;

public class Point<T> {
    private T var;
    public T getVar() {
        return var;
    }
    public void setVar(T var) {
        this.var = var;
    }
}
