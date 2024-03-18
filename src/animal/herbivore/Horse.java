package animal.herbivore;

import animal.Animal;
import title.NamesAnimal;

import java.util.Map;

public class Horse extends Animal {

    {
        setAnimalName(NamesAnimal.HORSE);
        setWeight(400);
        setSpeed(4);
        setMaxSaturation(60);
        setLuck(Map.ofEntries(
                Map.entry(NamesAnimal.PLANT, 100)
        ));
    }
}
