package util;

import java.util.concurrent.atomic.AtomicInteger;

public class Id {
    private static final AtomicInteger atomicInteger = new AtomicInteger();
    private Id() {
    }
    public static int next(){
        return atomicInteger.incrementAndGet();
    }
}
