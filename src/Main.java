import island.Island;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Island island = new Island(2, 2);
        island.initialIsland();
        try (ExecutorService executorService = Executors.newScheduledThreadPool(4)) {
            executorService.execute(island);
            executorService.shutdown();
        }
    }
}