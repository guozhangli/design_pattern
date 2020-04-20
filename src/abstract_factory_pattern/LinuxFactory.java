package abstract_factory_pattern;

public class LinuxFactory implements IFactory {

    @Override
    public <T extends IView> T newInstance1(Class<T> clz) {
        LinuxProduct linuxProduct = null;
        try {
            linuxProduct = (LinuxProduct) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) linuxProduct;
    }
}
