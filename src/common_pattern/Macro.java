package common_pattern;

import java.util.ArrayList;
import java.util.List;

public class Macro {
    private final List<Action> actionList;

    public Macro() {
        actionList = new ArrayList<>();
    }

    public void record(Action action) {
        actionList.add(action);
    }

    public void run() {
        actionList.forEach(Action::perform);
    }
}

