import config.InitialValue;
import island.Island;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Island island = new Island(InitialValue.HEIGHT_ISLAND, InitialValue.WIDTH_ISLAND);
        island.initialIsland();
        try (ExecutorService executorService = Executors.newScheduledThreadPool(2)) {
            executorService.execute(island);
            executorService.execute(island.information);
            executorService.shutdown();
        }
    }
}