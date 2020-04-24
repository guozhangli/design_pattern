package abstract_factory_pattern;

public class WindowsFactory implements IFactory {

    @Override
    public <T extends IView> T newInstance1(Class<T> clz) {
        WindowsProduct windowsProduct = null;
        try {
            windowsProduct = (WindowsProduct) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) windowsProduct;
    }
}
