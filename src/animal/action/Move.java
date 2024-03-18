package animal.action;

import animal.Animal;

import java.util.List;
import java.util.Set;

public interface Move {

    void move(List<List<Set<Animal>>> location);
}
