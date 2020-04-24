package test.thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FightQueryExample {
    private final static List<String> fightCompany = Arrays.asList("CSA", "CEA", "HNA");

    public static void main(String[] args) {
        List<String> results = search("SH", "BJ");
        System.out.println("----------result---------");
        results.forEach(System.out::println);
    }

    private static List<String> search(String origin, String destination) {

        final List<String> result = new ArrayList<>();
        List<FightTask> fightTasks = fightCompany.stream().map(f -> createFightTask(f, origin, destination)).collect(Collectors.toList());

        fightTasks.forEach(Thread::start);
        fightTasks.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        fightTasks.stream().map(FightTask::get).forEach(result::addAll);
        return result;
    }

    private static FightTask createFightTask(String fight, String origin, String destination) {
        return new FightTask(fight, origin, destination);
    }
}
