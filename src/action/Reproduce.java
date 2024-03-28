package action;

import entity.animal.Animal;
import entity.animal.herbivore.*;
import entity.animal.predator.*;
import config.NamesAnimal;
import util.Id;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ThreadLocalRandom;

public class Reproduce {
    private final Animal animal;
    private static final Set<Animal> BORN_THROUGH_REPRODUCTION = new CopyOnWriteArraySet<>();

    public Reproduce(Animal animal) {
        this.animal = animal;
    }

    public static void addBornThroughReproduction(Animal animal) {
        BORN_THROUGH_REPRODUCTION.add(animal);
    }

    public static void bornThroughReproduction(Set<Animal> animals) {
        animals.addAll(BORN_THROUGH_REPRODUCTION);
        BORN_THROUGH_REPRODUCTION.clear();
    }

    public void reproduce(Set<Animal> animalsOnLocation) {
        Iterator<Animal> iterator = animalsOnLocation.iterator();
        Animal animalPair;
        while (iterator.hasNext()) {
            animalPair = iterator.next();
            if (animal.getAnimalName().equals(animalPair.getAnimalName()) && animal.isSaturation() == animalPair.isSaturation() && animal.getId() != animalPair.getId()) {
                animal.setSaturation(false);
                animalPair.setSaturation(false);
                animal.setQuantitySaturation(0);
                animalPair.setQuantitySaturation(0);
                animalPair.setEndSpeed(true);
                animal.setEndSpeed(true);
                numberReproduce(animalPair);
                break;
            }
        }
    }

    public void numberReproduce(Animal animalPair) {
        int i = ThreadLocalRandom.current().nextInt(1, 3);
        while (i > 0) {
            Animal animal = switch (animalPair.getAnimalName()) {
                case NamesAnimal.CATERPILLAR -> new Caterpillar(Id.next(), true);
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
                default -> throw new IllegalStateException("Unexpected value: " + animalPair.getAnimalName());
            };
            addBornThroughReproduction(animal);
            i--;
        }
    }
}
