package observer_pattern;

public class Nasa implements LandIngObserver {

    @Override
    public void observerLanding(String name) {
        if (name.contains("Apollo")) {
            System.out.println("we made it!");
        }
    }
}
