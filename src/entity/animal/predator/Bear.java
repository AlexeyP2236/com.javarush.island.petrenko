package entity.animal.predator;

import entity.animal.Animal;
import config.NamesAnimal;

import java.util.Map;

public class Bear extends Animal {

    {
        setAnimalName(NamesAnimal.BEAR);
        setWeight(500);
        setSpeed(2);
        setQuantitySpeed(getSpeed());
        setMaxSaturation(80);
        setMaxQuantity(5);
        setProbabilityOfCatching(Map.ofEntries(
                Map.entry(NamesAnimal.BOA, 80),
                Map.entry(NamesAnimal.FOX, 40),
                Map.entry(NamesAnimal.DEER, 80),
                Map.entry(NamesAnimal.RABBIT, 80),
                Map.entry(NamesAnimal.MOUSE, 90),
                Map.entry(NamesAnimal.GOAT, 70),
                Map.entry(NamesAnimal.SHEEP, 70),
                Map.entry(NamesAnimal.HOG, 50),
                Map.entry(NamesAnimal.BUFFALO, 20),
                Map.entry(NamesAnimal.DUCK, 10)
        ));
        setPredator(true);
    }

    public Bear(long id) {
        super(id);
    }
}
