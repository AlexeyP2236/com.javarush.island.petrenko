package animal.herbivore;

import animal.Animal;
import title.NamesAnimal;

import java.util.Map;

public class Sheep extends Animal {

    {
        setAnimalName(NamesAnimal.SHEEP);
        setWeight(70);
        setSpeed(3);
        setMaxSaturation(15);
        setLuck(Map.ofEntries(
                Map.entry(NamesAnimal.PLANT, 100)
        ));
    }
}
