package test;

import java.util.ArrayList;
import java.util.List;

public class TestHeapOutOfMemory {

    static class OOMObject {

    }

    public static void main(String[] args) {

        List<OOMObject> list = new ArrayList<>();
       /* for(;;){
            list.add(new OOMObject());
        }*/
    }
}
