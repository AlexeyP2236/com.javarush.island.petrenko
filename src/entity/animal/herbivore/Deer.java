package entity.animal.herbivore;

import entity.animal.Animal;
import config.NamesAnimal;

import java.util.Map;

public class Deer extends Animal {

    {
        setAnimalName(NamesAnimal.DEER);
        setWeight(300);
        setSpeed(4);
        setQuantitySpeed(getSpeed());
        setMaxSaturation(50);
        setMaxQuantity(20);
        setProbabilityOfCatching(Map.ofEntries(
                Map.entry(NamesAnimal.PLANT, 100)
        ));
    }

    public Deer(long id) {
        super(id);
    }
}
