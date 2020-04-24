package proxy_pattern;

public class Proxy implements ISubject {

    private ISubject subject;

    public Proxy(ISubject subject) {
        this.subject = subject;
    }


    @Override
    public void operate() {
        per();
        subject.operate();
        after();
    }

    public void per() {
        System.out.println("per-operate");
    }

    public void after() {
        System.out.println("after operate");
    }
}
