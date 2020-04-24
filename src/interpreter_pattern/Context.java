package interpreter_pattern;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<Expression, Integer> map = new HashMap<>();

    public void add(Expression e, Integer i) {
        map.put(e, i);
    }

    public int get(Expression e) {
        return map.get(e);
    }
}
