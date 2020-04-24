package single_pattern;

/**
 * 懒加载，线程不安全
 */
public class Single_1 {
    private static Single_1 single_1;

    private Single_1() {

    }

    public static Single_1 instance() {
        if (single_1 == null) {
            single_1 = new Single_1();
        }
        return single_1;
    }
}
