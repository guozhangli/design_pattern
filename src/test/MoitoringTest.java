package test;

import java.util.ArrayList;
import java.util.List;

public class MoitoringTest {

    static class OOMObject {
        public byte[] placeholder = new byte[64 * 1024];
    }

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> oomObjectList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Thread.sleep(50);
            oomObjectList.add(new OOMObject());
        }
    }

    public static void main(String[] args) {
        try {
            MoitoringTest.fillHeap(1000);
            System.gc();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
