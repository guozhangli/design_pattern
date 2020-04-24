package blamechain_pattern;

/**
 * 教导主任
 */
public class Director extends Leader {
    @Override
    protected void handleRequest(Integer num) {
        if (num > 3 && num <= 5) {
            System.out.println("director approve");
        } else {
            if (this.leader != null) {
                this.leader.handleRequest(num);
            }
        }
    }
}
