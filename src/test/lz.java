package test;

import java.text.DateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class lz {
    private static ThreadLocal tl = ThreadLocal.withInitial(() -> DateFormat.getDateInstance());

    public static void main(String[] args) {

        System.out.printf("shij");
        DateFormat df = (DateFormat) tl.get();
        System.out.println(df.format(new Date()));

        List<String> list = Stream.of("a", "b", "c").collect(Collectors.toList());

        assert (Arrays.asList("a", "b", "c").equals(list));
        System.out.println(Arrays.asList("a", "b", "c").equals(list));

        List<String> list1 = Stream.of("a", "b", "c").map(e -> e.toUpperCase()).collect(Collectors.toList());

        assert Arrays.asList("a", "b", "c").equals(list1);
        System.out.println(Arrays.asList("A", "B", "C").equals(list1));

        List<String> list2 = Stream.of("a", "b", "c").filter(e -> e.equals("b")).collect(Collectors.toList());
        System.out.println(Arrays.asList("b").equals(list2));

        List<Integer> together = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
                .flatMap(numbers -> numbers.stream())
                .collect(Collectors.toList());
        System.out.println(together.toString());

        System.out.println(addUp(Stream.of(1, 2, 3, 4, 5)));

        List<String> list3 = Stream.of("d", "e", "f").map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(list3);

        Map<String, List<String>> map = new HashMap<>();
        map.put("1", list1);
        map.put("2", list3);

        System.out.println(map.values().stream().flatMap(e -> e.stream()).collect(Collectors.toList()));

    }

    private static int addUp(Stream<Integer> numbers) {
        return numbers.reduce(0, (a, n) -> a + n).intValue();
    }
}
