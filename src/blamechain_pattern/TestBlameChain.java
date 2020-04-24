package blamechain_pattern;

public class TestBlameChain {

    public static void main(String[] args) {
        Leader leader1 = new Teacher();
        Leader leader2 = new Director();
        Leader leader3 = new Rector();
        leader1.setNext(leader2);
        leader2.setNext(leader3);
        leader1.handleRequest(7);
    }
}
