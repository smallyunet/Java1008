package net.smallyu.java.designpattern.stragegy.cases5;

public enum Calculator {
    // 加法运算
    ADD("+") {
        public int exec(int a, int b) {
            return a + b;
        }
    },
    AUB("-") {
        public int exec(int a, int b) {
            return a - b;
        }
    };
    String value = "";
    // 定义成员值类型
    private Calculator(String _value) {
        this.value = _value;
    }
    // 获得美剧成员的值
    public String getValue() {
        return this.value;
    }
    // 声明一个抽象函数
    public abstract int exec(int a, int b);
}
