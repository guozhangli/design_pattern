package strategy_pattern;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public class GzipCompress implements CompressStrategy {
    @Override
    public OutputStream compress(OutputStream data) throws IOException {
        return new GZIPOutputStream(data);
    }

    @Override
    public void compress(String s) {
        System.out.println(s);
    }
}
