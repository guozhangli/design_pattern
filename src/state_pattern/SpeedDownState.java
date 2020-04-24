package state_pattern;

public class SpeedDownState implements State {
    @Override
    public void run(Hero hero) {
        System.out.println("speed down running");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hero.setState(Hero.COMMON);
    }
}
