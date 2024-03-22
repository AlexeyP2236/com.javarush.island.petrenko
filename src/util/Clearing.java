package util;

import entity.Plant;
import entity.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Clearing {
    private final static List<Plant> plantsEat = new ArrayList<>();
    private final static List<Animal> animalDead = new ArrayList<>();
    private Clearing(){}

    public static void addPlantsEat(Plant plant) {
        plantsEat.add(plant);
    }
    public static void addAnimalDead(Animal animal){
        animalDead.add(animal);
    }


    public static void plantsClearing(List<Plant> plants){
        plants.removeAll(plantsEat);
        plantsEat.clear();
    }

    public static void animalClearing(List<Animal> animals){
        animals.removeAll(animalDead);
        animalDead.clear();
    }
}
