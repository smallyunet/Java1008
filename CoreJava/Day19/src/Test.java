import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Test implements Iterable
{
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    public static void main(String[] args) {
        Collection l = new ArrayList();
        l.add(1);
        l.add(2);
        for(Object i : l) {
            System.out.println(i);
        }
//        l.forEach(l);
    }

}


