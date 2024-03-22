package entity.animal.action;

import util.Clearing;
import entity.Plant;
import entity.animal.Animal;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class Eat {
    private final Animal animal;
    public Eat(Animal animal) {
        this.animal = animal;
    }
    public double probabilityEaten(List<Animal> animalsOnLocation, List<Plant> plantOnLocation, double saturationNumber) {
        if (!animal.isPredator()) {
            for (Plant plant : plantOnLocation) {
                if (plant.isPlantEaten()) continue;
                if (plant.getWeight() >= animal.getMaxSaturation()) {
                    saturationNumber = animal.getMaxSaturation();
                    plant.setWeight((double) Math.round((plant.getWeight() - saturationNumber) * 100) / 100);
                    animal.setSaturation(true);
                    break;
                } else {
                    saturationNumber += plant.getWeight();
                    plant.setPlantEaten(true);
                    Clearing.addPlantsEat(plant);
                }
            }
        } else {
            int chance = ThreadLocalRandom.current().nextInt(100);
            for (Animal animalEaten : animalsOnLocation) {
                if (animalEaten.isDead()) continue;
                for (Map.Entry<String, Integer> luck : animal.getLuck().entrySet()) {
                    if (luck.getKey().equals(animalEaten.getAnimalName()) && luck.getValue() >= chance) {
                        if (animalEaten.getWeight() >= animal.getMaxSaturation() - saturationNumber) {
                            saturationNumber = animal.getMaxSaturation();
                            animalEaten.setDead(true);
                            Clearing.addAnimalDead(animalEaten);
                            animal.setSaturation(true);
                            return saturationNumber;
                        } else {
                            saturationNumber += animalEaten.getWeight();
                            animalEaten.setDead(true);
                            Clearing.addAnimalDead(animalEaten);
                            break;
                        }
                    }
                }
            }
        }
        return saturationNumber;
    }
}
