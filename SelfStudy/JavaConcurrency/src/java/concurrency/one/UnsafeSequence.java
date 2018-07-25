package java.concurrency.one;

@NotThreadSafe
public class UnsafeSequence {
    private int value;

    /** 返回一个唯一的数值 **/
    public int getNext() {
        return value++;
    }
}
