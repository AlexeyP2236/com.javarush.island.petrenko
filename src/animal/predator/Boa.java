package animal.predator;

import animal.Animal;
import title.NamesAnimal;

import java.util.Map;

public class Boa extends Animal {

    {
        setAnimalName(NamesAnimal.BOA);
        setWeight(15);
        setSpeed(1);
        setMaxSaturation(3);
        setLuck(Map.ofEntries(
                Map.entry(NamesAnimal.RABBIT, 20),
                Map.entry(NamesAnimal.MOUSE, 40),
                Map.entry(NamesAnimal.DUCK, 10)
        ));
    }

    public Boa(int id) {
        super(id);
    }
}
