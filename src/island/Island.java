package island;

import util.Id;
import entity.animal.herbivore.Mouse;
import entity.animal.herbivore.Rabbit;
import entity.Plant;
import entity.animal.predator.Eagle;

public class Island {
    public Location[][] locationNew;

    public Island() {
    }

    public Island(int height, int width) {
        locationNew = new Location[height][width];
    }

    // для рандома можно сделать отдельную функцию и передать в конструктор, отдельно вставить траву
    public void initialIsland() {
        for (int i = 0; i < locationNew.length; i++) {
            for (int j = 0; j < locationNew[i].length; j++) {
                locationNew[i][j] = new Location();
                locationNew[i][j].plants.add(new Plant());
                locationNew[i][j].plants.add(new Plant());
                locationNew[i][j].plants.add(new Plant());
                locationNew[i][j].plants.add(new Plant());
                locationNew[i][j].plants.add(new Plant());
                locationNew[i][j].plants.add(new Plant());
                locationNew[i][j].animals.add(new Mouse(Id.next()));
                locationNew[i][j].animals.add(new Rabbit(Id.next()));
                locationNew[i][j].animals.add(new Rabbit(Id.next()));
                locationNew[i][j].animals.add(new Rabbit(Id.next()));
                locationNew[i][j].animals.add(new Rabbit(Id.next()));
                locationNew[i][j].animals.add(new Eagle(Id.next()));
                locationNew[i][j].animals.add(new Eagle(Id.next()));
            }
        }
    }

    public void test() {
        for (int i = 0; i < locationNew.length; i++) {
            for (int j = 0; j < locationNew[i].length; j++) {
                locationNew[i][j].animalsMove(locationNew, i, j);
//                locationNew[i][j].animalsEat();
//                locationNew[i][j].animalsReproduce();
            }
        }
    }
}
