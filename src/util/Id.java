package util;

import java.util.concurrent.atomic.AtomicLong;

public class Id {
    private static final AtomicLong atomicLong = new AtomicLong();
    private Id() {
    }
    public static long next(){
        return atomicLong.incrementAndGet();
    }
}
