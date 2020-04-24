package test.thread;

import java.util.ArrayList;
import java.util.List;

public class ImmuntabelTest {
    public static void main(String[] args) {
        Immuntable immuntable = new Immuntable(new ArrayList<>());
        List<String> list = immuntable.getList();
        list.add("a");
        List<String> list1 = new ArrayList<>();
        list1.add("b");
        list = list1;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
