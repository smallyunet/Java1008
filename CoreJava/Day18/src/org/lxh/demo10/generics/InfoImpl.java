package org.lxh.demo10.generics;

public class InfoImpl<T> implements Info<T> {
    private T var;
    public InfoImpl(T var) {
        this.setVar(var);
    }
    public void setVar(T var) {
        this.var = var;
    }
    public T getVar() {
        return this.var;
    }
}
