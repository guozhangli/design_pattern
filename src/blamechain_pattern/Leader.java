package blamechain_pattern;

public abstract class Leader {

    protected Leader leader;

    protected void setNext(Leader leader) {
        this.leader = leader;
    }

    protected abstract void handleRequest(Integer num);
}
