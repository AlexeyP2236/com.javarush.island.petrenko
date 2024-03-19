package island;

import animal.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Island {
    private List<List<Set<Animal>>> location = new ArrayList<>();
    private int width;
    private int height;

    public Island(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
