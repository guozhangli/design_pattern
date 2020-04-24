package blamechain_pattern;

/**
 * 校长
 */
public class Rector extends Leader {

    @Override
    protected void handleRequest(Integer num) {
        if (num > 5) {
            System.out.println("rector approve");
        }
    }
}
