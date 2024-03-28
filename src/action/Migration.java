package action;

import entity.animal.Animal;
import island.Location;

import java.util.ArrayList;
import java.util.List;

public class Migration {
    private static final List<Animal> prepareAnimalsToMoveRight = new ArrayList<>();
    private static final List<Animal> prepareAnimalsToMoveLeft = new ArrayList<>();
    private static final List<Animal> prepareAnimalsToMoveUp = new ArrayList<>();
    private static final List<Animal> prepareAnimalsToMoveDown = new ArrayList<>();

    public static void addPrepareAnimalsToMoveRight(Animal animal){
        prepareAnimalsToMoveRight.add(animal);
    }

    public static void addPrepareAnimalsToMoveLeft(Animal animal){
        prepareAnimalsToMoveLeft.add(animal);
    }

    public static void addPrepareAnimalsToMoveUp(Animal animal){
        prepareAnimalsToMoveUp.add(animal);
    }

    public static void addPrepareAnimalsToMoveDown(Animal animal){
        prepareAnimalsToMoveDown.add(animal);
    }

    public static void startMigration(Location[][] locations, int height, int width){
        if (width + 1 < locations[height].length) {
            locations[height][width + 1].animals.addAll(prepareAnimalsToMoveRight);
        }
        if (width - 1 >= 0) {
            locations[height][width - 1].animals.addAll(prepareAnimalsToMoveLeft);
        }
        if (height - 1 >= 0) {
            locations[height - 1][width].animals.addAll(prepareAnimalsToMoveUp);
        }
        if (height + 1 < locations.length) {
            locations[height + 1][width].animals.addAll(prepareAnimalsToMoveDown);
        }




    }
}
