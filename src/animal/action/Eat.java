package animal.action;

import animal.Animal;
import title.NamesAnimal;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public interface Eat {
    void eat(Set<Animal> animalOnLocation);

    default double probabilityExtraction(Set<Animal> animalsOnLocation, Map<String, Integer> getLuck, double saturationNumber) {
        out:
        //проверяется удача
        for (Map.Entry<String, Integer> luck : getLuck.entrySet()) {
            // ищется на локации животное
            for (Animal animalEaten : animalsOnLocation) {
                int chance = ThreadLocalRandom.current().nextInt(100);
                // если совпадает
                if (luck.getKey().equals(animalEaten.getAnimalName()) && luck.getValue() >= chance) {
                    // если объем добычи больше или равно общего потребления минус уже потребленного с другой локации.
                    if (animalEaten.getWeight() >= saturationNumber) {
                        // Животное полностью употребило потребность в еде
                        saturationNumber += animalEaten.getWeight();
                        // если добыча растение
                        if (animalEaten.getAnimalName().equals(NamesAnimal.PLANT)) {
                            double eatPlant = animalEaten.getWeight() - saturationNumber;
                            animalEaten.setWeight(eatPlant);
                        } else { // если добыча животное
                            animalsOnLocation.remove(animalEaten);
                        }
                        return saturationNumber;
                    } else { // животное не полностью употребило потребность
                        saturationNumber += animalEaten.getWeight();
                        animalsOnLocation.remove(animalEaten);
                        break out;
                    }
                }
            }
        }
        return saturationNumber;
    }
}