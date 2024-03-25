package util;

import entity.Plant;
import entity.animal.Animal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Clearing {
    private final static List<Plant> plantsEat = new ArrayList<>();
    private final static Set<Animal> animalDead = new HashSet<>();
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
