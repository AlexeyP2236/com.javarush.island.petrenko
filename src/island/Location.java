package island;

import animal.Animal;

import java.util.HashSet;
import java.util.Set;

public class Location {


    // private int id;
    public Set<Animal> animals = new HashSet<>();

    public Location(Animal animal) {
       // id++;
        animals.add(animal);
    }
    public Location() {
    }
}
