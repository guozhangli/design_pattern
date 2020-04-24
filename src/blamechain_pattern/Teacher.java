package blamechain_pattern;

/**
 * 班主任
 */
public class Teacher extends Leader {

    @Override
    protected void handleRequest(Integer num) {
        if (num <= 3) {
            System.out.println("teacher approve");
        } else {
            if (this.leader != null) {
                this.leader.handleRequest(num);
            }
        }
    }
}
