package java.concurrency.three;

import java.util.HashSet;
import java.util.Set;

@Tmmutable
public class ThreeStooges {
    private final Set<String> stooges = new HashSet<String>();

    public ThreeStooges() {
        stooges.add("Moe");
        stooges.add("Larry");
        stooges.add("Curly");
    }

    public boolean isStooge(String name) {
        return stoopes.contains(name);
    }
}
