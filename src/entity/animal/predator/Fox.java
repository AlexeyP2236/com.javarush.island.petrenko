package entity.animal.predator;

import entity.animal.Animal;
import title.NamesAnimal;

import java.util.Map;

public class Fox extends Animal {

    {
        setAnimalName(NamesAnimal.FOX);
        setWeight(8);
        setSpeed(2);
        setQuantitySpeed(getSpeed());
        setMaxSaturation(2);
        setMaxQuantity(30);
        setLuck(Map.ofEntries(
                Map.entry(NamesAnimal.RABBIT, 70),
                Map.entry(NamesAnimal.MOUSE, 90),
                Map.entry(NamesAnimal.DUCK, 60),
                Map.entry(NamesAnimal.CATERPILLAR, 40)
        ));
        setPredator(true);
    }

    public Fox(int id) {
        super(id);
    }
}
