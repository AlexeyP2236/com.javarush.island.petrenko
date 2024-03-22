package entity.animal.action;

import entity.animal.Animal;

import java.util.List;
import java.util.Set;

public interface Move {

    void move(List<List<Set<Animal>>> location);
}
