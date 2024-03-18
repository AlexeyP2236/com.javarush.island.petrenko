package animal.predator;

import animal.Animal;
import title.NamesAnimal;

import java.util.Map;

public class Fox extends Animal {

    {
        setAnimalName(NamesAnimal.FOX);
        setWeight(8);
        setSpeed(2);
        setMaxSaturation(2);
        setLuck(Map.ofEntries(
                Map.entry(NamesAnimal.RABBIT, 70),
                Map.entry(NamesAnimal.MOUSE, 90),
                Map.entry(NamesAnimal.DUCK, 60),
                Map.entry(NamesAnimal.CATERPILLAR, 40)
        ));
    }
}
