package entity.animal.herbivore;

import entity.animal.Animal;
import entity.animal.action.Reproduce;
import title.NamesAnimal;

import java.util.List;
import java.util.Map;

public class Caterpillar extends Animal {


    {
        setAnimalName(NamesAnimal.CATERPILLAR);
        setWeight(0.01);
        setSpeed(0);
        setMaxSaturation(0);
    }

    public Caterpillar(int id) {
        super(id);
    }

    @Override
    public void reproduce(List<Animal> animalsOnLocation) {
        new Reproduce(this).reproduce(animalsOnLocation);
    }
}
