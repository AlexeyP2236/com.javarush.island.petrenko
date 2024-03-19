package animal.herbivore;

import animal.Animal;
import title.NamesAnimal;

import java.util.Map;

public class Duck extends Animal {

    {
        setAnimalName(NamesAnimal.DUCK);
        setWeight(1);
        setSpeed(4);
        setMaxSaturation(0.15);
        setLuck(Map.ofEntries(
                Map.entry(NamesAnimal.CATERPILLAR, 90),
                Map.entry(NamesAnimal.PLANT, 100)
        ));
    }

    public Duck(int id) {
        super(id);
    }
}
