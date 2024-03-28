package entity.animal.herbivore;

import entity.animal.Animal;
import config.NamesAnimal;

import java.util.Map;

public class Hog extends Animal {

    {
        setAnimalName(NamesAnimal.HOG);
        setWeight(400);
        setSpeed(2);
        setQuantitySpeed(getSpeed());
        setMaxSaturation(20);
        setMaxQuantity(50);
        setProbabilityOfCatching(Map.ofEntries(
                Map.entry(NamesAnimal.CATERPILLAR, 90),
                Map.entry(NamesAnimal.MOUSE, 50)
        ));
    }

    public Hog(long id) {
        super(id);
    }
}
