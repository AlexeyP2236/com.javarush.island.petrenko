package entity.animal.herbivore;

import entity.animal.Animal;
import title.NamesAnimal;

import java.util.Map;

public class Deer extends Animal {


    {
        setAnimalName(NamesAnimal.DEER);
        setWeight(300);
        setSpeed(4);
        setQuantitySpeed(getSpeed());
        setMaxSaturation(50);
        setMaxQuantity(20);
        setLuck(Map.ofEntries(
                Map.entry(NamesAnimal.PLANT, 100)
        ));
    }

    public Deer(int id) {
        super(id);
    }
}
