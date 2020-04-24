package observer_pattern;

public class Aliens implements LandIngObserver {

    @Override
    public void observerLanding(String name) {
        if (name.contains("Apollo")) {
            System.out.println("They're distracted,lets invade earth!");
        }
    }
}
