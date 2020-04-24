package single_pattern;

//懒加载、线程安全
public final class Single_7 {//不能被继承

    private Single_7() {//不能被实例化

    }

    private enum EnumHolder {
        INSTANCE;
        private Single_7 single_7;

        EnumHolder() {
            this.single_7 = new Single_7();
        }

        private Single_7 getSingle_7() {
            return single_7;
        }
    }

    public static Single_7 getInstance() {
        return EnumHolder.INSTANCE.getSingle_7();
    }
}
