package test.classloader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMyClassLoader {
    public static void main(String[] args) throws ClassNotFoundException,
            IllegalAccessException,
            InstantiationException, NoSuchMethodException, InvocationTargetException {

        MyClassLoader myClassLoader = new MyClassLoader();
        Class<?> aClass = myClassLoader.loadClass("test.classloader.HelloWorld");
        System.out.println(aClass.getClassLoader());

        Object obj = aClass.newInstance();
        System.out.println(obj);

        Method method = aClass.getMethod("welcome");
        String value = (String) method.invoke(obj);
        System.out.println(value);

    }
}
