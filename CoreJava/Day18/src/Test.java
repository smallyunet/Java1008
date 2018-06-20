import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>() {
            {
                for (int i = 0; i < 5; i++) {
                    add(i);
                }
            }
        };
//        System.out.println(list);
        list.forEach((i) -> System.out.println(i));

//        Map<String, Integer> map3 = {"a4": 4, "a5": 5};   error

        // test
        Map map = new HashMap();
        map.put("a1", 1);
        map.put("a2", "b");
        System.out.println(map.get("a1"));

        // test
        Map<String, String> map2 = new HashMap<>();
        map.put("a3", 2);
        System.out.println(map.get("a3"));
    }
}
