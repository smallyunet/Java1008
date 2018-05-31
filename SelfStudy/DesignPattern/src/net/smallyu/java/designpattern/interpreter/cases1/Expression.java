package net.smallyu.java.designpattern.interpreter.cases1;

import java.util.HashMap;

public abstract class Expression {
    public abstract int interpreter(HashMap<String, Integer> var);
}
