package proxy_pattern;

public class Subject implements ISubject {
    @Override
    public void operate() {
        System.out.println("operate");
    }
}
