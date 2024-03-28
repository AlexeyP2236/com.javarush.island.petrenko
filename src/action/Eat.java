package action;

import entity.Plant;
import entity.animal.Animal;
import util.Clearing;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Eat {
    private final Animal animal;

    public Eat(Animal animal) {
        this.animal = animal;
    }

    public double probabilityEaten(Set<Animal> animalsOnLocation, List<Plant> plantOnLocation, double saturationNumber) {
        if (!animal.isPredator()) {
            saturationNumber = animalPlantEaten(plantOnLocation, saturationNumber);
        }
        if (!animal.isSaturation()){
            saturationNumber = animalHunting(animalsOnLocation, saturationNumber);
        }
        return saturationNumber;
    }

    private double animalPlantEaten(List<Plant> plantOnLocation, double saturationNumber) {
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
        return saturationNumber;
    }

    private double animalHunting(Set<Animal> animalsOnLocation, double saturationNumber) {
        int chance = ThreadLocalRandom.current().nextInt(100);
        for (Animal animalEaten : animalsOnLocation) {
            if (animalEaten.isDeadOrEmpty()) continue;
            for (Map.Entry<String, Integer> luck : animal.getProbabilityOfCatching().entrySet()) {
                if (luck.getKey().equals(animalEaten.getAnimalName()) && luck.getValue() >= chance) {
                    if (animalEaten.getWeight() >= animal.getMaxSaturation() - saturationNumber) {
                        saturationNumber = animal.getMaxSaturation();
                        animalEaten.setDeadOrEmpty(true);
                        Clearing.addAnimalDeadOrEmpty(animalEaten);
                        animal.setSaturation(true);
                        return saturationNumber;
                    } else {
                        saturationNumber += (double) Math.round((animalEaten.getWeight() - saturationNumber) * 100) / 100;
                        animalEaten.setDeadOrEmpty(true);
                        Clearing.addAnimalDeadOrEmpty(animalEaten);
                        break;
                    }
                }
            }
        }
        return saturationNumber;
    }
}
