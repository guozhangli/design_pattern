package state_pattern;

public class CommonState implements State {
    @Override
    public void run(Hero hero) {
        System.out.println("common running");
    }
}
