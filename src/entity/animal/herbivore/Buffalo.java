package entity.animal.herbivore;

import entity.animal.Animal;
import config.NamesAnimal;

import java.util.Map;

public class Buffalo extends Animal {

    {
        setAnimalName(NamesAnimal.BUFFALO);
        setWeight(700);
        setSpeed(3);
        setQuantitySpeed(getSpeed());
        setMaxSaturation(100);
        setMaxQuantity(10);
        setProbabilityOfCatching(Map.ofEntries(
                Map.entry(NamesAnimal.PLANT, 100)
        ));
    }

    public Buffalo(long id) {
        super(id);
    }
}
