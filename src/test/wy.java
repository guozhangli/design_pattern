package test;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class wy {
    public static void main(String[] args) {
        SAXParserFactory spf = SAXParserFactory.newInstance();
        try {
            SAXParser sp = spf.newSAXParser();
            sax handler = new sax();
            sp.parse("/home/gzli/IdeaProjects/test/src/test/user", handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
