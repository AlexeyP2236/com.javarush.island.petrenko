package island;

import animal.Animal;
import animal.herbivore.Mouse;
import animal.plant.Plant;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Island {
    private int id;
    private List<List<List<Animal>>> location = new ArrayList<>();
    private int width;
    private int height;

    public Set<Animal> animals = new HashSet<>();

    public Location[][] locationNew = new Location[width + 1][height + 1];

    public Island(Set<Animal> animals) {
        this.animals = animals;
    }

    public Island(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public List<List<List<Animal>>> getLocation() {
        return location;
    }

//    public void setLocation(List<List<Set<Animal>>> location) {
//        this.location = location;
//    }

    public void initialIsland() {
//        for (int i = 0; i < locationNew.length; i++) {
//            for (int j = 0; j < locationNew[i].length; j++) {
//                locationNew[i][j].animals.add(new Plant(getId()));
//                locationNew[i][j].animals.add(new Plant(getId()));
//                locationNew[i][j].animals.add(new Plant(getId()));
//                locationNew[i][j].animals.add(new Plant(getId()));
//                locationNew[i][j].animals.add(new Plant(getId()));
////                locationNew[i][j] = new Location(new Plant(getId()));
////                locationNew[i][j] = new Location(new Plant(getId()));
////                locationNew[i][j] = new Location(new Plant(getId()));
////                locationNew[i][j] = new Location(new Mouse(getId()));
//            }
//        }


        for (int i = 0; i < width; i++) {
            location.add(new ArrayList<>());
            for (int j = 0; j < height; j++) {
                location.get(i).add(new ArrayList<>());
                location.get(i).get(j).add(new Plant(getId()));
                location.get(i).get(j).add(new Plant(getId()));
                location.get(i).get(j).add(new Plant(getId()));
                location.get(i).get(j).add(new Plant(getId()));
                location.get(i).get(j).add(new Mouse(getId()));
                location.get(i).get(j).add(new Mouse(getId()));
                location.get(i).get(j).add(new Mouse(getId()));
            }
        }
    }

    //возможное решение ConcurrentModificationException
    //https://stackoverflow.com/questions/8104692/how-to-avoid-java-util-concurrentmodificationexception-when-iterating-through-an
    //https://habr.com/ru/articles/325426/
    public void test() {
//        List<Animal> hex = location.get(0).get(0);
//        for (int i = 0; i < hex.size(); i++) {
//            reproduce(hex);
//        }
//        for (Animal animal : hex) {
////            animal.eat(hex);
//
//        }
//        location.forEach(list1 -> list1
//                .forEach(list2 -> list2
//                        .forEach(
//                                animal -> {
//                                    animal.eat(hex);
//                                }
//                        )));
    }

    public void reproduce(List<Animal> animalsOnLocation) {
        int i = ThreadLocalRandom.current().nextInt(1, 3);
        while (i > 0) {
            animalsOnLocation.add(new Plant(9));
            i--;
        }

    }

    public int getId() {
        return id++;
    }
}
