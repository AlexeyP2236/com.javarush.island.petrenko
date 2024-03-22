package entity.animal.herbivore;

import entity.animal.Animal;
import title.NamesAnimal;

import java.util.Map;

public class Goat extends Animal {

    {
        setAnimalName(NamesAnimal.GOAT);
        setWeight(60);
        setSpeed(3);
        setMaxSaturation(10);
        setLuck(Map.ofEntries(
                Map.entry(NamesAnimal.PLANT, 100)
        ));
    }

    public Goat(int id) {
        super(id);
    }
}
