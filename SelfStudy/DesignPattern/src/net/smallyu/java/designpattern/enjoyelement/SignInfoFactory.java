package net.smallyu.java.designpattern.enjoyelement;

import java.util.HashMap;

public class SignInfoFactory {
    // 池容器
    private static HashMap<String, SignInfo> pool = new HashMap<String, SignInfo>();

    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;
        if(!pool.containsKey(key)) {
            System.out.println(key + "----建立对象，并放置到池中");
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        } else {
            result = pool.get(key);
            System.out.println(key + "----直接获得");
        }
        return result;
    }

    @Deprecated
    public static SignInfo getSignInfo() {
        return new SignInfo();
    }
}
