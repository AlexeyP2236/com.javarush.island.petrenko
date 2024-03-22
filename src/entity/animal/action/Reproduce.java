package entity.animal.action;

import entity.animal.Animal;
import entity.animal.herbivore.*;
import entity.animal.predator.*;
import title.NamesAnimal;
import util.Id;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Reproduce {
    private final Animal animal;

    public Reproduce(Animal animal) {
        this.animal = animal;
    }

    public void numberReproduce(List<Animal> animalsOnLocation) {
        Iterator<Animal> iterator = animalsOnLocation.iterator();
        Animal animalPair;
        while (iterator.hasNext()) {
            animalPair = iterator.next();
            if (animal.getAnimalName().equals(animalPair.getAnimalName()) && animal.isSaturation() == animalPair.isSaturation() && animal.getId() != animalPair.getId()) {
                animal.setSaturation(false);
                animalPair.setSaturation(false);
                animal.setSaturationNumber(0);
                animalPair.setSaturationNumber(0);
                numberReproduce(animalsOnLocation, animalPair);
                break;
            }
        }
    }

    public void numberReproduce(List<Animal> animalsOnLocation, Animal animalPatent) {
        int i = ThreadLocalRandom.current().nextInt(1, 3);
        while (i > 0) {
            Animal animal = switch (animalPatent.getAnimalName()) {
                case NamesAnimal.CATERPILLAR -> new Caterpillar(Id.next());
                case NamesAnimal.MOUSE -> new Mouse(Id.next());
                case NamesAnimal.DUCK -> new Duck(Id.next());
                case NamesAnimal.RABBIT -> new Rabbit(Id.next());
                case NamesAnimal.SHEEP -> new Sheep(Id.next());
                case NamesAnimal.GOAT -> new Goat(Id.next());
                case NamesAnimal.HOG -> new Hog(Id.next());
                case NamesAnimal.DEER -> new Deer(Id.next());
                case NamesAnimal.HORSE -> new Horse(Id.next());
                case NamesAnimal.BUFFALO -> new Buffalo(Id.next());
                case NamesAnimal.BOA -> new Boa(Id.next());
                case NamesAnimal.EAGLE -> new Eagle(Id.next());
                case NamesAnimal.FOX -> new Fox(Id.next());
                case NamesAnimal.WOLF -> new Wolf(Id.next());
                case NamesAnimal.BEAR -> new Bear(Id.next());
                default -> throw new IllegalStateException("Unexpected value: " + animalPatent.getAnimalName());
            };
            animalsOnLocation.add(animal);
            i--;
        }
    }
}
