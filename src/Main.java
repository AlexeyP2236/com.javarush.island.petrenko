import island.Island;

public class Main {
    public static void main(String[] args) {
        Island island = new Island(5, 5);
        island.initialIsland();
        island.actionAnimal();
        System.out.println("#".repeat(20));
        island.information();
        island.endCycle();
    }
}