package test.thread;

import java.util.concurrent.TimeUnit;

public class VolaiteFoo {

    final static int MAX = 5;
    static volatile int init_value = 0;

    public static void main(String[] args) {

        new Thread(() -> {
            int local_value = init_value;
            while (init_value < MAX) {

                //System.out.printf("the init_value is [%d]\n",init_value);
                if (local_value != init_value) {
                    System.out.printf("the init_value is updated to [%d]\n", init_value);
                    init_value = local_value;
                } else {
//                    try {
//                        TimeUnit.SECONDS.sleep(2);
//                        System.out.printf("the init_value is [%d]\n",init_value);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }
            }
        }, "Reader").start();

        new Thread(() -> {
            int local_value = init_value;
            while (init_value < MAX) {
                System.out.printf("the init_value will be changed to [%d]\n", ++local_value);
                init_value = local_value;
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Writer").start();
    }
}
