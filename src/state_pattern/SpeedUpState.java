package state_pattern;

public class SpeedUpState implements State {
    @Override
    public void run(Hero hero) {
        System.out.println("speed up running");
        hero.setState(Hero.COMMON);
    }
}
