package island;

import entity.Plant;
import entity.animal.Animal;
import entity.animal.herbivore.*;
import entity.animal.predator.*;
import util.Id;
import util.RandomIsland;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class InitialEntities {
    public List<Plant> addPlantsInLocation = new CopyOnWriteArrayList<>();
    public Set<Animal> addAnimalsInLocation = new CopyOnWriteArraySet<>();

    {
        initialPlants();
        initialAnimal();
    }

    public void initialPlants() {
        int number = 200;
        while (number > 0) {
            addPlantsInLocation.add(new Plant(Id.next()));
            number--;
        }
    }

    public void initialAnimal() {
        int value = new RandomIsland().randomValue(5);
        while (value > 0) {
            addAnimalsInLocation.add(new Buffalo(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(500);
        while (value > 0) {
            addAnimalsInLocation.add(new Caterpillar(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(10);
        while (value > 0) {
            addAnimalsInLocation.add(new Deer(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(100);
        while (value > 0) {
            addAnimalsInLocation.add(new Duck(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(70);
        while (value > 0) {
            addAnimalsInLocation.add(new Goat(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(25);
        while (value > 0) {
            addAnimalsInLocation.add(new Hog(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(10);
        while (value > 0) {
            addAnimalsInLocation.add(new Horse(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(250);
        while (value > 0) {
            addAnimalsInLocation.add(new Mouse(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(75);
        while (value > 0) {
            addAnimalsInLocation.add(new Rabbit(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(70);
        while (value > 0) {
            addAnimalsInLocation.add(new Sheep(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(4);
        while (value > 0) {
            addAnimalsInLocation.add(new Bear(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(15);
        while (value > 0) {
            addAnimalsInLocation.add(new Boa(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(10);
        while (value > 0) {
            addAnimalsInLocation.add(new Eagle(Id.next()));
            value--;
        }

        value = new RandomIsland().randomValue(15);
        while (value > 0) {
            addAnimalsInLocation.add(new Fox(Id.next()));
            value--;
        }
        value = new RandomIsland().randomValue(15);
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
