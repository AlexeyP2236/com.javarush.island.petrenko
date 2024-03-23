package island;

import entity.animal.action.Reproduce;
import entity.animal.herbivore.Caterpillar;
import util.Born;
import util.Clearing;
import entity.animal.Animal;
import entity.Plant;

import java.util.ArrayList;
import java.util.List;

public class Location {
    public List<Plant> plants = new ArrayList<>();
    public List<Animal> animals = new ArrayList<>();

    public Location() {
    }

    public boolean isDeadOrEndSpeedAnimal() {
        for (Animal animal : animals) {
            if (animal.isDead() || animal.isEndSpeed()) return true;
        }
        return false;
    }

    public void animalsEat() {
        for (Animal animal : animals) {
            animal.eat(animals, plants);
        }
        Clearing.plantsClearing(plants);
        Clearing.animalClearing(animals);
    }

    public void animalsReproduce() {
        for (Animal animal : animals) {
            animal.reproduce(animals);
        }
        Born.bornThroughReproduction(animals);
    }

    public void animalsMove(Location[][] locations, int height, int width) {
        for (Animal animal : animals) {
            if (animal.isDead() || animal.isEndSpeed()) continue;
            if (animal instanceof Caterpillar) {
                animal.reproduce(animals);
                return;
            }
            animal.eat(animals, plants);
            animal.reproduce(animals);
            animal.move(locations, animals, plants, height, width);
        }
        Clearing.plantsClearing(plants);
        Clearing.animalClearing(animals);
        Born.bornThroughReproduction(animals);
//        for (int i = animals.size() - 1; i >= 0; i--) {
//
//        }
    }

}
