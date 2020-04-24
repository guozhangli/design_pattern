package test.socket;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionTest {

    public static void main(String[] args) {
        try {
            URL u = new URL("http://www.baidu.com");
            URLConnection uc = u.openConnection();
            try (InputStream is = uc.getInputStream()) {
                BufferedInputStream bis = new BufferedInputStream(is);
                Reader reader = new InputStreamReader(bis);//平台默认的编码方式
                int c;
                while ((c = reader.read()) != -1) {
                    System.out.print((char) c);
                }
            }
        } catch (MalformedURLException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
