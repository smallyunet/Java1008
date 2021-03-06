package net.smallyu.java.designpattern.factory.delay;

import net.smallyu.java.designpattern.factory.ConcreteProduct1;
import net.smallyu.java.designpattern.factory.ConcreteProduct2;
import net.smallyu.java.designpattern.factory.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
    private static final Map<String, Product> prMap = new HashMap();
    public static synchronized Product createProduct(String type) throws Exception {
        Product product = null;
        // 如果Map中已经有这个对象
        if(prMap.containsKey(type)) {
            product = prMap.get(type);
        } else {
            if(type.equals("Product1")) {
                product = new ConcreteProduct1();
            } else {
                product = new ConcreteProduct2();
            }
            // 放入缓存
            prMap.put(type, product);
        }
        return product;
    }
}
