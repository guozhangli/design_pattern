package test.classloader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyClassLoader extends ClassLoader {

    private final static Path DEFULT_PATH = Paths.get("/home/gzli/classload1");

    private static Path classDir;

    public MyClassLoader() {
        super();
        this.classDir = DEFULT_PATH;
    }

    public MyClassLoader(String classDir) {
        super();
        this.classDir = Paths.get(classDir);
    }

    public MyClassLoader(String classDir, ClassLoader classLoader) {
        super(classLoader);
        this.classDir = Paths.get(classDir);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] classBytes = readClassBytes(name);
        if (classBytes == null || classBytes.length == 0) {
            throw new ClassNotFoundException("can not load the class " + name);
        }

        return this.defineClass(name, classBytes, 0, classBytes.length);
    }


    private byte[] readClassBytes(String name) throws ClassNotFoundException {
        String classPath = name.replace(".", "/");
        Path path = classDir.resolve(Paths.get(classPath + ".class"));
        if (!path.toFile().exists()) {
            throw new ClassNotFoundException("the class " + name + " not found.");
        }
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            Files.copy(path, baos);
            return baos.toByteArray();
        } catch (IOException e) {
            throw new ClassNotFoundException("the class" + name + " not found.", e);
        }
    }
}
