package single_pattern;

/**
 * 懒加载，线程安全
 */
public class Single_2 {
    private static Single_2 single_2;

    private Single_2() {

    }

    public static Single_2 instance() {
        if (single_2 == null) {
            synchronized (Single_2.class) {
                if (single_2 == null) {
                    single_2 = new Single_2();
                }
            }
        }
        return single_2;
    }
}
