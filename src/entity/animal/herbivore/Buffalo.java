package entity.animal.herbivore;

import entity.animal.Animal;
import title.NamesAnimal;

import java.util.Map;

public class Buffalo extends Animal {


    {
        setAnimalName(NamesAnimal.BUFFALO);
        setWeight(700);
        setSpeed(3);
        setMaxSaturation(100);
        setLuck(Map.ofEntries(
                Map.entry(NamesAnimal.PLANT, 100)
        ));
    }

    public Buffalo(int id) {
        super(id);
    }
}
