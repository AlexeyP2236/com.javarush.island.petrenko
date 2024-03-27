import island.Island;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Island island = new Island(20, 20);
        island.initialIsland();
        Thread actionAnimal = new Thread(island.threadActionAnimal);
        actionAnimal.start();
        Thread checkCycle = new Thread();
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(actionAnimal);
        executorService.shutdown();

//        checkCycle.start();
//        for (int i = 0; i < 100; i++) {
//            island.actionAnimal();
//            island.checkCycle();
//            System.out.println("#".repeat(20));
//            island.information();
//            island.endCycle();
//            island.postPlant();
//        }
//        ExecutorService executorService = new ScheduledThreadPoolExecutor(4);
    }
}