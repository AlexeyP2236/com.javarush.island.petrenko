package animal.herbivore;

import animal.Animal;
import title.NamesAnimal;

import java.util.Map;

public class Deer extends Animal {


    {
        setAnimalName(NamesAnimal.DEER);
        setWeight(300);
        setSpeed(4);
        setMaxSaturation(50);
        setLuck(Map.ofEntries(
                Map.entry(NamesAnimal.PLANT, 100)
        ));
    }

    public Deer(int id) {
        super(id);
    }
}
