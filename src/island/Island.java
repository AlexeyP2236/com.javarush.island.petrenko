package island;

import entity.Plant;
import entity.animal.Animal;
import island.information.GeneralInformation;

import java.util.ArrayList;
import java.util.List;

public class Island {
    public Location[][] locations;

    public Island(int heightLocation, int widthLocation) {
        locations = new Location[heightLocation][widthLocation];
    }

    public void initialIsland() {
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[i].length; j++) {
                locations[i][j] = new Location();
                locations[i][j].plants.addAll(new InitialEntities().addPlantsInLocation);
                locations[i][j].animals.addAll(new InitialEntities().addAnimalsInLocation);
            }
        }
    }

    public void actionAnimal() {
        for (int height = 0; height < locations.length; height++) {
            for (int width = 0; width < locations[height].length; width++) {
                locations[height][width].animalsAction(locations, height, width);
            }
        }
    }

    public void checkCycle() {
        List<Animal> check = new ArrayList<>();
        for (Location[] location : locations) {
            for (Location location1 : location) {
               check = location1.animals.stream().filter(Animal::isEndSpeed).toList();
            }
        }
        if (check.isEmpty()) {
            // закончить цикл, подсчет и обнуление некоторых характеристик. После подсчета заново запуск локацию
            System.out.println("End Cycle");
        }
    }

    public void endCycle() {
        for (Location[] location : locations) {
            for (Location location1 : location) {
                location1.animals.forEach(animal -> {
                    animal.setEndSpeed(false);
                    animal.setQuantitySpeed(animal.getSpeed());
                    animal.setSaturation(false);
                });
            }
        }
    }

    public void postPlant(){
        for (Location[] location : locations) {
            for (Location value : location) {
                int number = 200 - value.plants.size();
                while (number > 0) {
                    value.plants.add(new Plant());
                    number--;
                }

            }
        }
    }
    public void test(){
        List<Animal> check = new ArrayList<>();
        for (Location[] location : locations) {
            for (Location location1 : location) {
                check = location1.animals.stream().filter(Animal::isSaturation).toList();
            }
        }
        if (check.isEmpty()) {
            System.out.println("setSaturation(false)");
        }
    }
    public void information() {
        GeneralInformation generalInformation = new GeneralInformation();
        for (Location[] location : locations) {
            for (Location value : location) {
                value.plants.forEach(generalInformation::addPlantsInformation);
                value.animals.forEach(generalInformation::addAnimalsInformation);
            }
        }
        generalInformation.printInformation();
    }
}
