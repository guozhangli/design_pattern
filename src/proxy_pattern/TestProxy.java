package proxy_pattern;

public class TestProxy {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Subject());
        proxy.operate();
    }
}
