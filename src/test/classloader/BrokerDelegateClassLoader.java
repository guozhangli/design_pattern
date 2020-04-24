package test.classloader;

public class BrokerDelegateClassLoader extends MyClassLoader {

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        synchronized (getClassLoadingLock(name)) {
            // First, check if the class has already been loaded
            Class<?> c = findLoadedClass(name);
            if (c == null) {
                if (name.startsWith("java.") || name.startsWith("javax.")) {
                    c = getSystemClassLoader().loadClass(name);
                } else {
                    c = findClass(name);
                }

                if (c == null) {
                    // If still not found, then invoke findClass in order
                    // to find the class.
                    if (getParent() != null) {
                        c = getParent().loadClass(name);
                    } else {
                        c = getSystemClassLoader().loadClass(name);
                    }
                }
            }
            if (resolve) {
                resolveClass(c);
            }
            return c;
        }
    }
}
