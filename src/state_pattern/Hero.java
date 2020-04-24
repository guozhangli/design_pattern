package state_pattern;

public class Hero {

    public static final State COMMON = new CommonState();

    public static final State RUN = new RunState();

    public static final State SPEEDDOWN = new SpeedDownState();

    public static final State SPEEDUP = new SpeedUpState();

    public static final State SWIM = new SwimState();

    private State state = COMMON;

    public void setState(State state) {
        this.state = state;
    }

    public void startRun() {
        state.run(this);
    }

    public void stopRun() {
        System.out.println("stop");
    }

}
