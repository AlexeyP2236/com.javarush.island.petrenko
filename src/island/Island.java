package island;

import config.InitialValue;
import entity.Plant;
import entity.animal.Animal;
import util.Id;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Island implements Runnable {
    public Location[][] locations;
    public boolean stopActionAnimal = false;
    public boolean allDead = false;

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
        List<Animal> checkEndCycle = new CopyOnWriteArrayList<>();
        int checkAllDead = 0;
        for (Location[] location : locations) {
            for (Location location1 : location) {
                checkEndCycle = location1.animals.stream().filter(animal -> !animal.isEndSpeed()).toList();
                checkAllDead += location1.animals.size();

            }
        }
        if (checkAllDead == 0) {
            System.out.println("All Dead");
            allDead = true;
        }
        if (checkEndCycle.isEmpty()) {
            try {
                Thread.sleep((int)(InitialValue.INFORMATION_INTERVAL_IN_SECONDS * 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            stopActionAnimal = true;
        }
    }

    public void endCycle() {
        for (Location[] location : locations) {
            for (Location location1 : location) {
                location1.animals.forEach(animal -> {
                    animal.setEndSpeed(false);
                    animal.setQuantitySpeed(animal.getSpeed());
                    animal.setSaturation(false);
                    animal.setQuantitySaturation(0);
                });
            }
        }
    }

    public void postPlant() {
        for (Location[] location : locations) {
            for (Location value : location) {
                int number = 200 - value.plants.size();
                while (number > 0) {
                    value.plants.add(new Plant(Id.next()));
                    number--;
                }
            }
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

    public Runnable information = () -> {
        while (!allDead) {
            information();
        }
    };

    @Override
    public void run() {
        while (!allDead) {
            actionAnimal();
            checkCycle();
            if (stopActionAnimal) {
                endCycle();
                postPlant();
                stopActionAnimal = false;
            }
        }
    }
}
