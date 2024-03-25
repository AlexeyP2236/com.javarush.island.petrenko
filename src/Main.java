import island.Island;

public class Main {
    public static void main(String[] args) {
        Island island = new Island(100, 100);
        island.initialIsland();
        island.actionAnimal();
        System.out.println("#".repeat(20));
        island.information();
    }
}