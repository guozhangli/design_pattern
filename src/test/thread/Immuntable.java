package test.thread;

import java.util.Collections;
import java.util.List;

public final class Immuntable {

    private final List<String> list;

    public Immuntable(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return Collections.unmodifiableList(this.list);//不可变list
    }
}
