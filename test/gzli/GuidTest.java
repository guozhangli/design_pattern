package gzli;

import org.junit.Test;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class GuidTest {

    @Test
    public void testGuid(){
        UUID uuid=UUID.randomUUID();
        long j=1;
        for (int i=0;i<uuid.toString().getBytes().length;i++){
            j*=((int)uuid.toString().getBytes()[i]+1);
        }
        String str=String.format("%s",j-System.currentTimeMillis());
        System.out.println(str);
        System.out.println(str.length());
    }

    @Test
    public void testIdGenerator(){
        Set<Long> set=new CopyOnWriteArraySet<>();
        Executor executor=Executors.newFixedThreadPool(100);
        Runnable r=()->{
            long id= IDGenerator.nId();
            set.add(id);
            System.out.println(id);
            System.out.println(String.valueOf(id).length());
        };

        IntStream.range(0,10000).forEach(i->{
            executor.execute(r);
        });
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(set.size());
    }

}
