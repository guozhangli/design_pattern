package factory_pattern;

public abstract class Factory {

    protected abstract <T extends Car> T getInstance(Class<T> clz);
}
