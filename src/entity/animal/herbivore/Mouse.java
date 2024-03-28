package entity.animal.herbivore;

import entity.animal.Animal;
import config.NamesAnimal;

import java.util.Map;

public class Mouse extends Animal {

    {
        setAnimalName(NamesAnimal.MOUSE);
        setWeight(0.05);
        setSpeed(1);
        setQuantitySpeed(getSpeed());
        setMaxSaturation(0.01);
        setMaxQuantity(500);
        setProbabilityOfCatching(Map.ofEntries(
                Map.entry(NamesAnimal.CATERPILLAR, 90),
                Map.entry(NamesAnimal.PLANT, 100)
        ));
    }

    public Mouse(long id) {
        super(id);
    }
}
