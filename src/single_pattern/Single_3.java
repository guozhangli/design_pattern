package single_pattern;

/**
 * 饿汉式，线程安全
 */
public final class Single_3 {//不允许被继承

    private volatile static Single_3 single_3 = new Single_3();

    private Single_3() {

    }

    public static Single_3 instance() {
        return single_3;
    }
}
