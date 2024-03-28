package entity.animal.predator;

import entity.animal.Animal;
import config.NamesAnimal;

import java.util.Map;

public class Eagle extends Animal {

    {
        setAnimalName(NamesAnimal.EAGLE);
        setWeight(6);
        setSpeed(3);
        setQuantitySpeed(getSpeed());
        setMaxSaturation(1);
        setMaxQuantity(20);
        setProbabilityOfCatching(Map.ofEntries(
                Map.entry(NamesAnimal.FOX, 10),
                Map.entry(NamesAnimal.RABBIT, 90),
                Map.entry(NamesAnimal.MOUSE, 90),
                Map.entry(NamesAnimal.DUCK, 80)
        ));
        setPredator(true);
    }

    public Eagle(long id) {
        super(id);
    }
}
