package strategy_pattern;


public class TestStrategy {

    //策略模式
    public static void main(String[] args) {

        Compress compress = new Compress(new GzipCompress());
        // compress.compress();
        compress.compress("strategy 1 - gzipcompress");

        Compress compress1 = new Compress(new ZipCompress());

        compress1.compress("strategy 2- zipcompress");

    }
}
