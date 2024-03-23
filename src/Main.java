import island.Island;

public class Main {
    public static void main(String[] args) {
        Island island = new Island(1, 1);
        island.initialIsland();

        for (int i = 0; i < island.locationNew.length; i++) {
            for (int j = 0; j < island.locationNew[i].length; j++) {
                int finalI = i;
                int finalJ = j;
                island.locationNew[i][j].animals.forEach(animal -> System.out.println(" гекс (" + (finalI) + " " + (finalJ) + ") " + animal.getAnimalName() + ", id " + animal.getId() + ", вес " + animal.getWeight() + ", насыщенность " + animal.getQuantitySaturation()));
                System.out.println("-".repeat(20));
            }
        }
        System.out.println("!".repeat(20));
        for (int i = 0; i < island.locationNew.length; i++) {
            for (int j = 0; j < island.locationNew[i].length; j++) {
                int finalI = i;
                int finalJ = j;
                island.locationNew[i][j].plants.forEach(plant -> System.out.println(" гекс (" + (finalI) + " " + (finalJ) + ") " + plant.getPlantName() + ", вес " + plant.getWeight()));
                System.out.println("-".repeat(20));
            }
        }

        System.out.println("#".repeat(20));
        island.test();


        for (int i = 0; i < island.locationNew.length; i++) {
            for (int j = 0; j < island.locationNew[i].length; j++) {
                int finalI = i;
                int finalJ = j;
                island.locationNew[i][j].animals.forEach(animal -> System.out.println(" гекс (" + (finalI) + " " + (finalJ) + ") " + animal.getAnimalName() + ", id " + animal.getId() + ", вес " + animal.getWeight() + ", насыщенность " + animal.getQuantitySaturation()));
                System.out.println("-".repeat(20));
            }
        }
        System.out.println("!".repeat(20));
        for (int i = 0; i < island.locationNew.length; i++) {
            for (int j = 0; j < island.locationNew[i].length; j++) {
                int finalI = i;
                int finalJ = j;
                island.locationNew[i][j].plants.forEach(plant -> System.out.println(" гекс (" + (finalI) + " " + (finalJ) + ") " + plant.getPlantName() + ", вес " + plant.getWeight()));
                System.out.println("-".repeat(20));
            }
        }
    }
}