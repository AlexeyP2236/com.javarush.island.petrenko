package entity.animal.predator;

import entity.animal.Animal;
import title.NamesAnimal;

import java.util.Map;

public class Wolf extends Animal {
    {
        setAnimalName(NamesAnimal.WOLF);
        setWeight(50);
        setSpeed(3);
        setQuantitySpeed(getSpeed());
        setMaxSaturation(8);
        setMaxQuantity(30);
        setLuck(Map.ofEntries(
                Map.entry(NamesAnimal.HORSE, 10),
                Map.entry(NamesAnimal.DEER, 15),
                Map.entry(NamesAnimal.RABBIT, 60),
                Map.entry(NamesAnimal.MOUSE, 80),
                Map.entry(NamesAnimal.GOAT, 60),
                Map.entry(NamesAnimal.SHEEP, 70),
                Map.entry(NamesAnimal.HOG, 15),
                Map.entry(NamesAnimal.BUFFALO, 10),
                Map.entry(NamesAnimal.DUCK, 40)
        ));
        setPredator(true);
    }

    public Wolf(int id) {
        super(id);
    }
}
