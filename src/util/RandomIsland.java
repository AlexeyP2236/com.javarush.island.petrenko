package util;

import java.util.concurrent.ThreadLocalRandom;

public class RandomIsland {
    public int randomValue(int value){
        return ThreadLocalRandom.current().nextInt(value);
    }

    public int randomValueFromBefore(int from, int before){
        return ThreadLocalRandom.current().nextInt(from, before);
    }
}
