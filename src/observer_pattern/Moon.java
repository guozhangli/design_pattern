package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Moon {

    private final List<LandIngObserver> observerList = new ArrayList<>();

    public void observer(String name) {
        observerList.forEach(e -> {
            e.observerLanding(name);
        });
    }

    public void addObserver(LandIngObserver landIngObserver) {
        observerList.add(landIngObserver);
    }
}
