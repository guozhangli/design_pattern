package state_pattern;

public class RunState implements State {
    @Override
    public void run(Hero hero) {
        System.out.println("running state");
        hero.setState(Hero.COMMON);
    }
}
