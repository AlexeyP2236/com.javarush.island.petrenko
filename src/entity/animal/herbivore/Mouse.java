package entity.animal.herbivore;

import entity.animal.Animal;
import title.NamesAnimal;

import java.util.Map;

public class Mouse extends Animal {

    {
        setAnimalName(NamesAnimal.MOUSE);
        setWeight(0.05);
        setSpeed(1);
        setQuantitySpeed(getSpeed());
        setMaxSaturation(0.01);
        setMaxQuantity(500);
        setLuck(Map.ofEntries(
                Map.entry(NamesAnimal.CATERPILLAR, 90),
                Map.entry(NamesAnimal.PLANT, 100)
        ));
    }

    public Mouse(int id) {
        super(id);
    }
}
