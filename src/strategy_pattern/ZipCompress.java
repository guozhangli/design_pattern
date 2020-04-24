package strategy_pattern;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.ZipOutputStream;

public class ZipCompress implements CompressStrategy {
    @Override
    public OutputStream compress(OutputStream data) throws IOException {
        return new ZipOutputStream(data);
    }

    @Override
    public void compress(String s) {
        System.out.println(s);
    }
}
