package entity.animal.predator;

import entity.animal.Animal;
import title.NamesAnimal;

import java.util.Map;

public class Eagle extends Animal {

    {
        setAnimalName(NamesAnimal.EAGLE);
        setWeight(6);
        setSpeed(3);
        setMaxSaturation(1);
        setLuck(Map.ofEntries(
                Map.entry(NamesAnimal.FOX, 10),
                Map.entry(NamesAnimal.RABBIT, 90),
                Map.entry(NamesAnimal.MOUSE, 90),
                Map.entry(NamesAnimal.DUCK, 80)
        ));
        setPredator(true);
    }

    public Eagle(int id) {
        super(id);
    }
}
