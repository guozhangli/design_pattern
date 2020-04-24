package single_pattern;

import java.lang.reflect.Constructor;

//线程安全
public class Single_6 {
    private static Single_6 single_6;

    static {
        try {
            Class clz = Class.forName(Single_6.class.getName());
            Constructor constructor = clz.getDeclaredConstructor();
            constructor.setAccessible(true);//可访问构造函数
            single_6 = (Single_6) clz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Single_6 getInstance() {
        return single_6;
    }
}
