package action;

import entity.animal.Animal;
import island.Location;
import util.Clearing;
import util.RandomIsland;

public class Move {
    private final Animal animal;

    public Move(Animal animal) {
        this.animal = animal;
    }

    public void randomMove(Location[][] locations, int height, int width) {
        int randomMove = new RandomIsland().randomValueFromBefore(1, 5);
        int endWhile = 4;
        while (endWhile >= 0) {
            if (randomMove == 1 && width + 1 < locations[height].length) {
                if (animal.getMaxQuantity() >= locations[height][width + 1].information.getAnimalInformation(animal)) {
                    randomMove++;
                    endWhile--;
                    continue;
                }
                migrationRight();
                return;
            } else if (randomMove == 2 && width - 1 >= 0) {
                if (animal.getMaxQuantity() >= locations[height][width - 1].information.getAnimalInformation(animal)) {
                    randomMove++;
                    endWhile--;
                    continue;
                }
                migrationLeft();
                return;
            } else if (randomMove == 3 && height - 1 >= 0) {
                if (animal.getMaxQuantity() >= locations[height - 1][width].information.getAnimalInformation(animal)) {
                    randomMove++;
                    endWhile--;
                    continue;
                }
                migrationUp();
                return;
            } else if (randomMove == 4 && height + 1 < locations.length) {
                if (animal.getMaxQuantity() >= locations[height + 1][width].information.getAnimalInformation(animal)) {
                    randomMove = 1;
                    endWhile--;
                    continue;
                }
                migrationDown();
                return;
            } else {
                randomMove++;
                if (randomMove == 5) randomMove = 1;
            }
            endWhile--;
        }
    }

    public void migrationRight() {
        animal.setQuantitySpeed(animal.getQuantitySpeed() - 1);
        Migration.addPrepareAnimalsToMoveRight(animal);
        animal.setDeadOrEmpty(true);
        Clearing.addAnimalDeadOrEmpty(animal);
    }

    public void migrationLeft() {
        animal.setQuantitySpeed(animal.getQuantitySpeed() - 1);
        Migration.addPrepareAnimalsToMoveLeft(animal);
        animal.setDeadOrEmpty(true);
        Clearing.addAnimalDeadOrEmpty(animal);
    }

    public void migrationUp() {
        animal.setQuantitySpeed(animal.getQuantitySpeed() - 1);
        Migration.addPrepareAnimalsToMoveUp(animal);
        animal.setDeadOrEmpty(true);
        Clearing.addAnimalDeadOrEmpty(animal);
    }

    public void migrationDown() {
        animal.setQuantitySpeed(animal.getQuantitySpeed() - 1);
        Migration.addPrepareAnimalsToMoveDown(animal);
        animal.setDeadOrEmpty(true);
        Clearing.addAnimalDeadOrEmpty(animal);
    }
}
