package test.classloader;

public class Namespace {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader myclasssLoader = Namespace.class.getClassLoader();
        Class<?> aClass = myclasssLoader.loadClass("test.classloader.ClassInit");
        Class<?> bClass = myclasssLoader.loadClass("test.classloader.ClassInit");

        System.out.println(aClass.hashCode());
        System.out.println(bClass.hashCode());
        System.out.println(aClass == bClass);

        MyClassLoader myClassLoader = new MyClassLoader();
        BrokerDelegateClassLoader brokerDelegateClassLoader = new BrokerDelegateClassLoader();

        Class<?> cClass = myClassLoader.loadClass("test.classloader.HelloWorld");
        Class<?> dClass = brokerDelegateClassLoader.loadClass("test.classloader.HelloWorld");

        System.out.println(cClass.getClassLoader());
        System.out.println(dClass.getClassLoader());
        System.out.println(cClass.hashCode());
        System.out.println(dClass.hashCode());
        System.out.println(cClass == dClass);

        MyClassLoader myClassLoader1 = new MyClassLoader();

        Class<?> eClass = myClassLoader1.loadClass("test.classloader.HelloWorld");

        System.out.println(eClass.getClassLoader());
        System.out.println(eClass.hashCode());
        System.out.println(cClass == eClass);
    }
}
