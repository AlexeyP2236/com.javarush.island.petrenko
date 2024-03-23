package island;

import util.Clearing;
import entity.animal.Animal;
import entity.Plant;

import java.util.ArrayList;
import java.util.List;

public class Location {
    public List<Plant> plants = new ArrayList<>();
    public List<Animal> animals = new ArrayList<>();

    public Location(Animal animal) {
        animals.add(animal);
    }

    public void animalsEat() {
        for (Animal animal : animals) {
            animal.eat(animals, plants);
        }
        Clearing.plantsClearing(plants);
        Clearing.animalClearing(animals);
    }

    public void animalsReproduce() {
        for (int i = animals.size() - 1; i >= 0; i--) {
            animals.get(i).reproduce(animals);
        }
    }

    public void animalsMove(Location[][] locations, int height, int width) {
        for (int i = animals.size() - 1; i >= 0; i--) {
            animals.get(i).move(locations, animals, plants, height, width);
        }
    }
    public Location() {
    }
}
