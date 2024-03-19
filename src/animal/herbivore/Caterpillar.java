package animal.herbivore;

import animal.Animal;
import title.NamesAnimal;

import java.util.List;
import java.util.Map;

public class Caterpillar extends Animal {


    {
        setAnimalName(NamesAnimal.CATERPILLAR);
        setWeight(0.01);
        setSpeed(0);
        setMaxSaturation(0);
        setLuck(Map.ofEntries(
                Map.entry(NamesAnimal.PLANT, 100)
        ));
    }

    public Caterpillar(int id) {
        super(id);
    }
}
