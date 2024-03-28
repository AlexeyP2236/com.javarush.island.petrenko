package entity.animal.herbivore;

import entity.animal.Animal;
import config.NamesAnimal;

import java.util.Map;

public class Horse extends Animal {

    {
        setAnimalName(NamesAnimal.HORSE);
        setWeight(400);
        setSpeed(4);
        setQuantitySpeed(getSpeed());
        setMaxSaturation(60);
        setMaxQuantity(20);
        setProbabilityOfCatching(Map.ofEntries(
                Map.entry(NamesAnimal.PLANT, 100)
        ));
    }

    public Horse(long id) {
        super(id);
    }
}
