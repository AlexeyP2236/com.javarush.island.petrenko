package util;

import entity.Plant;
import entity.animal.Animal;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Clearing {
    private final static List<Plant> plantsEat = new CopyOnWriteArrayList<>();
    private final static Set<Animal> animalDead = new CopyOnWriteArraySet<>();
    private Clearing(){}

    public static void addPlantsEat(Plant plant) {
        plantsEat.add(plant);
    }
    public static void addAnimalDeadOrEmpty(Animal animal){
        animalDead.add(animal);
    }


    public static void plantsClearing(List<Plant> plants){
        plants.removeAll(plantsEat);
        plantsEat.clear();
    }

    public static void animalClearing(Set<Animal> animals){
        animals.removeAll(animalDead);
        animalDead.clear();
    }
}
