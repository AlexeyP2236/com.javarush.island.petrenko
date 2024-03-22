package entity.animal.herbivore;

import entity.animal.Animal;
import title.NamesAnimal;

import java.util.Map;

public class Hog extends Animal {

    {
        setAnimalName(NamesAnimal.HOG);
        setWeight(400);
        setSpeed(2);
        setMaxSaturation(20);
        setLuck(Map.ofEntries(
                Map.entry(NamesAnimal.CATERPILLAR, 90),
                Map.entry(NamesAnimal.PLANT, 100)
        ));
    }

    public Hog(int id) {
        super(id);
    }
}
