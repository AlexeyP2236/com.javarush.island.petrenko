package entity.animal.herbivore;

import action.Reproduce;
import entity.animal.Animal;
import island.information.GeneralInformation;
import title.NamesAnimal;

import java.util.Set;

public class Caterpillar extends Animal {


    {
        setAnimalName(NamesAnimal.CATERPILLAR);
        setWeight(0.01);
        setSpeed(0);
        setMaxSaturation(0);
        setMaxQuantity(1000);
    }

    public Caterpillar(int id) {
        super(id);
    }

    public Caterpillar(int id, boolean endSpeed) {
        super(id, endSpeed);
    }

    @Override
    public void reproduce(Set<Animal> animalsOnLocation, GeneralInformation information) {
        if(getMaxQuantity() >= information.getAnimalInformation(this)){
            new Reproduce(this).reproduce(animalsOnLocation);
        }
    }
}
