package state_pattern;

public class SwimState implements State {
    @Override
    public void run(Hero hero) {
        System.out.println("swim state");
        hero.setState(Hero.COMMON);
    }
}
