package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map flyweights = new HashMap();

    public static FlyweightFactory factory = new FlyweightFactory();

    public static FlyweightFactory getInstance() {
        return factory;
    }

    public Flyweight getFlyweight(String key) {

        if (flyweights.containsKey(key)) {
            return (Flyweight) flyweights.get(key);
        }

        else {
            Flyweight fw = new ConcreteFlyweight("my world");
            flyweights.put(key, fw);
            return fw;
        }
    }

}
