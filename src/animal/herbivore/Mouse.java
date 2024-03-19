package animal.herbivore;

import animal.Animal;
import title.NamesAnimal;

import java.util.Map;

public class Mouse extends Animal {

    {
        setAnimalName(NamesAnimal.MOUSE);
        setWeight(0.05);
        setSpeed(1);
        setMaxSaturation(0.01);
        setLuck(Map.ofEntries(
                Map.entry(NamesAnimal.CATERPILLAR, 90),
                Map.entry(NamesAnimal.PLANT, 100)
        ));
    }

    public Mouse(int id) {
        super(id);
    }
}
