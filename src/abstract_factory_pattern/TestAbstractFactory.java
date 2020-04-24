package abstract_factory_pattern;

public class TestAbstractFactory {
    public static void main(String[] args) {

        LinuxFactory lf = new LinuxFactory();
        LinuxButton lb = lf.newInstance1(LinuxButton.class);
        lb.button();


        WindowsFactory wf = new WindowsFactory();
        WindowsMenu wm = wf.newInstance1(WindowsMenu.class);
        wm.meun();
    }
}
