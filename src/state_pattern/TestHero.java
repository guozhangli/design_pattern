package state_pattern;

public class TestHero {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.startRun();
        hero.stopRun();

        hero.setState(Hero.RUN);
        hero.startRun();
        hero.stopRun();

        hero.setState(Hero.SWIM);
        hero.startRun();
        hero.stopRun();

    }
}
