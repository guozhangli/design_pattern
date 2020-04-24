package single_pattern;

/**
 * 懒加载，线程安全（Holder方式）
 */
public class Single_4 {

    private static class Single_5 {
        private static final Single_4 single_4 = new Single_4();
    }

    private Single_4() {

    }

    public static final Single_4 instance() {
        return Single_5.single_4;
    }
}
