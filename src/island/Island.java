package island;

import island.information.GeneralInformation;

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
    public void information(){
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
