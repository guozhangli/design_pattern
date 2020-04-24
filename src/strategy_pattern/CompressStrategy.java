package strategy_pattern;

import java.io.IOException;
import java.io.OutputStream;

public interface CompressStrategy {
    OutputStream compress(OutputStream data) throws IOException;

    void compress(String s);
}
