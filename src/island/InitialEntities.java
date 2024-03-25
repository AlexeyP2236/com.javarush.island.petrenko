package island;

import entity.Plant;
import entity.animal.Animal;
import entity.animal.herbivore.*;
import entity.animal.predator.*;
import util.Id;
import util.RandomIsland;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InitialEntities {
    public List<Plant> addPlantsInLocation = new ArrayList<>();
    public Set<Animal> addAnimalsInLocation = new HashSet<>();

    {
        initialPlants();
        initialAnimal();
    }

    public void initialPlants() {
        int number = 200;
        while (number > 0) {
            addPlantsInLocation.add(new Plant());
            number--;
        }
    }

    public void initialAnimal() {
        int value = new RandomIsland().randomValue(2);
        while (value > 0) {
            addAnimalsInLocation.add(new Buffalo(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(100);
        while (value > 0) {
            addAnimalsInLocation.add(new Caterpillar(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(3);
        while (value > 0) {
            addAnimalsInLocation.add(new Deer(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(20);
        while (value > 0) {
            addAnimalsInLocation.add(new Duck(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(14);
        while (value > 0) {
            addAnimalsInLocation.add(new Goat(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(5);
        while (value > 0) {
            addAnimalsInLocation.add(new Hog(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(3);
        while (value > 0) {
            addAnimalsInLocation.add(new Horse(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(50);
        while (value > 0) {
            addAnimalsInLocation.add(new Mouse(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(15);
        while (value > 0) {
            addAnimalsInLocation.add(new Rabbit(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(14);
        while (value > 0) {
            addAnimalsInLocation.add(new Sheep(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(2);
        while (value > 0) {
            addAnimalsInLocation.add(new Bear(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(4);
        while (value > 0) {
            addAnimalsInLocation.add(new Boa(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(3);
        while (value > 0) {
            addAnimalsInLocation.add(new Eagle(Id.next()));
            value--;
        }

        value = new RandomIsland().randomValue(4);
        while (value > 0) {
            addAnimalsInLocation.add(new Fox(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(4);
        while (value > 0) {
            addAnimalsInLocation.add(new Wolf(Id.next()));
            value--;
        }
    }

//    public void initialQuantityAnimal(int value, Animal animal) {
//        value = new RandomIsland().randomValue(value);
//        while (value > 0) {
//            addAnimalsInLocation.add(animal);
//            value--;
//        }
//    }
}
