package entity.animal.herbivore;

import entity.animal.Animal;
import title.NamesAnimal;

import java.util.Map;

public class Rabbit extends Animal {


    {
        setAnimalName(NamesAnimal.RABBIT);
        setWeight(2);
        setSpeed(2);
        setMaxSaturation(0.45);
        setLuck(Map.ofEntries(
                Map.entry(NamesAnimal.PLANT, 100)
        ));
    }

    public Rabbit(int id) {
        super(id);
    }
}
