package strategy_pattern;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Compress {

    private final CompressStrategy compressStrategy;

    public Compress(CompressStrategy compressStrategy) {
        this.compressStrategy = compressStrategy;
    }

    public void compress(Path inFile, File outFile) throws IOException {
        try (OutputStream outputStream = new FileOutputStream(outFile)) {
            Files.copy(inFile, compressStrategy.compress(outputStream));
        }

    }

    public void compress(String s) {
        compressStrategy.compress(s);
    }
}
