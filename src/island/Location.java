package island;

import action.Reproduce;
import entity.Plant;
import entity.animal.Animal;
import entity.animal.herbivore.Caterpillar;
import util.Clearing;
import action.Migration;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Location {
    public List<Plant> plants = new CopyOnWriteArrayList<>();
    public Set<Animal> animals = new CopyOnWriteArraySet<>();
    public GeneralInformation information = new GeneralInformation();

    public Location() {
    }

    public void animalsAction(Location[][] locations, int height, int width) {
        animals.forEach(information::addAnimalsInformation);
        plants.forEach(information::addPlantsInformation);

        //information.printInformation();
        for (Animal animal : animals) {
            if (animal.isDeadOrEmpty() || animal.isEndSpeed()) continue;
            information.addAnimalsInformation(animal);
            if (animal instanceof Caterpillar) {
                animal.reproduce(animals, information);
                continue;
            }
            animal.eat(animals, plants);
            animal.reproduce(animals, information);
            animal.move(locations, height, width);
        }
        Clearing.plantsClearing(plants);
        Clearing.animalClearing(animals);
        Reproduce.bornThroughReproduction(animals);
        Migration.startMigration(locations, height, width);
        information.clearInformation();
//        plants.forEach(information::addPlantsInformation);
//        animals.forEach(information::addAnimalsInformation);
        //  information.printInformation();
  // System.out.println("-".repeat(20));
    }
}
