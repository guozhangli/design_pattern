package observer_pattern;

public class TestObserver {
    public static void main(String[] args) {

        Moon moon = new Moon();
        moon.addObserver(new Aliens());
        moon.addObserver(new Nasa());
        moon.observer("Apollo");
    }
}
