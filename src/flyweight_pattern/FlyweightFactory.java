package flyweight_pattern;

import java.util.HashMap;

public class FlyweightFactory {

    private static HashMap<String, Flyweight> pool = new HashMap<>();


    public static Flyweight getFlyweight(String Extrinsic) {
        Flyweight flyweight = null;
        if (pool.containsKey(Extrinsic)) {
            flyweight = pool.get(Extrinsic);
        } else {
            flyweight = new ConcreteFlyweight1(Extrinsic);
            pool.put(Extrinsic, flyweight);
        }
        return flyweight;
    }
}
