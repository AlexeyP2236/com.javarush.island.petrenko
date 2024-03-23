package entity.animal.action;

import entity.animal.Animal;
import island.Location;

import java.util.ArrayList;
import java.util.List;

public class Move {
    private final Location[][] locations;
    private int height;
    private int width;

    public Move(Location[][] locations, int height, int wight) {
        this.locations = locations;
        this.width = wight;
        this.height = height;
    }

    public void right(Animal animal) {
        locations[height][width + 1].animals.add(animal);
    }

    public void left(Animal animal) {
        locations[height][width - 1].animals.add(animal);
    }

    public void up(Animal animal) {
        locations[height - 1][width].animals.add(animal);
    }

    public void down(Animal animal) {
        locations[height + 1][width].animals.add(animal);
    }
}
