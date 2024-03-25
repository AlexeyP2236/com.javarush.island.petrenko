package entity.animal.herbivore;

import entity.animal.Animal;
import title.NamesAnimal;

import java.util.Map;

public class Duck extends Animal {

    {
        setAnimalName(NamesAnimal.DUCK);
        setWeight(1);
        setSpeed(4);
        setQuantitySpeed(getSpeed());
        setMaxSaturation(0.15);
        setMaxQuantity(200);
        setLuck(Map.ofEntries(
                Map.entry(NamesAnimal.CATERPILLAR, 90),
                Map.entry(NamesAnimal.PLANT, 100)
        ));
    }

    public Duck(int id) {
        super(id);
    }
}
