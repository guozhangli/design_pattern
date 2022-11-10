package blamechain_pattern;

public class TestBlameChain {

    /**
     * 责任链模式是一种创建处理对象序列（比如操作序列）的通用方案。一个处理对象可能需要
     * 在完成一些工作之后，将结果传递给另一个对象，这个对象接着做一些工作，再转交给下一个处
     * 理对象，以此类推。
     * @param args
     */
    public static void main(String[] args) {
        Leader leader1 = new Teacher();
        Leader leader2 = new Director();
        Leader leader3 = new Rector();
        leader1.setNext(leader2);
        leader2.setNext(leader3);
        leader1.handleRequest(7);
    }
}
