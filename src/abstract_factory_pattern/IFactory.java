package abstract_factory_pattern;

public interface IFactory {
    <T extends IView> T newInstance1(Class<T> clz);
}
