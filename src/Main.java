import island.Island;

public class Main {
    public static void main(String[] args) {
        Island island = new Island(2, 2);
        island.initialIsland();
        Thread actionAnimal = new Thread(island.threadActionAnimal);
        actionAnimal.start();
        Thread checkCycle = new Thread(island.checkCycle);
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