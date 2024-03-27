package island;

import action.Reproduce;
import entity.Plant;
import entity.animal.Animal;
import entity.animal.herbivore.Caterpillar;
import island.information.GeneralInformation;
import util.Clearing;
import util.Migration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Location {
    public List<Plant> plants = new ArrayList<>();
    public Set<Animal> animals = new HashSet<>();
    public GeneralInformation information = new GeneralInformation();

    public Location() {
    }

    public void animalsAction(Location[][] locations, int height, int width) {
        animals.forEach(information::addAnimalsInformation);
        //plants.forEach(information::addPlantsInformation);
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
       // information.printInformation();
        Clearing.plantsClearing(plants);
        Clearing.animalClearing(animals);
        Reproduce.bornThroughReproduction(animals);
        Migration.startMigration(locations, height, width);
        information.clearInformation();
        plants.forEach(information::addPlantsInformation);
        animals.forEach(information::addAnimalsInformation);
      //  information.printInformation();
      //  System.out.println("-".repeat(20));
    }
}
