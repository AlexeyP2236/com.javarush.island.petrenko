package util;

import entity.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Born {
    private final static List<Animal> BORN_THROUGH_REPRODUCTION = new ArrayList<>();

    public static void addBornThroughReproduction(Animal animal) {
        BORN_THROUGH_REPRODUCTION.add(animal);
    }

    public static void bornThroughReproduction(List<Animal> animals) {
        animals.addAll(BORN_THROUGH_REPRODUCTION);
        BORN_THROUGH_REPRODUCTION.clear();
    }
}
