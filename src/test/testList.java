package test;

import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class testList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 1000; i++) {
            list.add(String.valueOf(i));
        }
        List<String> list1 = new ArrayList<>();
        list.parallelStream().forEach(e -> {
            list1.add(String.valueOf(2000));
            //System.out.println(e);
        });
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        //固定大小线程池
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(new MyJob());
    }

    static class MyJob implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 2000; i++) {
                System.out.println(i);
            }
        }
    }
}
