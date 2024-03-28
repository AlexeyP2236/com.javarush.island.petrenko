package island;

import entity.Plant;
import entity.animal.Animal;
import entity.animal.herbivore.*;
import entity.animal.predator.*;

public class GeneralInformation {
    private int totalPlant;
    private int totalBuffalo;
    private int totalCaterpillar;
    private int totalDeer;
    private int totalDuck;
    private int totalGoat;
    private int totalHog;
    private int totalHorse;
    private int totalMouse;
    private int totalRabbit;
    private int totalSheep;
    private int totalBear;
    private int totalBoa;
    private int totalEagle;
    private int totalFox;
    private int totalWolf;

    public void addPlantsInformation(Plant plant) {
        if (plant != null) totalPlant++;
    }

    public void addAnimalsInformation(Animal animal) {
        if (animal instanceof Buffalo) totalBuffalo++;
        if (animal instanceof Caterpillar) totalCaterpillar++;
        if (animal instanceof Deer) totalDeer++;
        if (animal instanceof Duck) totalDuck++;
        if (animal instanceof Goat) totalGoat++;
        if (animal instanceof Hog) totalHog++;
        if (animal instanceof Horse) totalHorse++;
        if (animal instanceof Mouse) totalMouse++;
        if (animal instanceof Rabbit) totalRabbit++;
        if (animal instanceof Sheep) totalSheep++;
        if (animal instanceof Bear) totalBear++;
        if (animal instanceof Boa) totalBoa++;
        if (animal instanceof Eagle) totalEagle++;
        if (animal instanceof Fox) totalFox++;
        if (animal instanceof Wolf) totalWolf++;
    }

    public void clearInformation() {
        totalPlant = 0;
        totalBuffalo = 0;
        totalCaterpillar = 0;
        totalDeer = 0;
        totalDuck = 0;
        totalGoat = 0;
        totalHog = 0;
        totalHorse = 0;
        totalMouse = 0;
        totalRabbit = 0;
        totalSheep = 0;
        totalBear = 0;
        totalBoa = 0;
        totalEagle = 0;
        totalFox = 0;
        totalWolf = 0;
    }

    public void printInformation() {
        System.out.println("Растение: " + totalPlant
                + " Буйвол: " + totalBuffalo
                + " Гусеница: " + totalCaterpillar
                + " Олень: " + totalDeer
                + " Утка: " + totalDuck
                + " Коза: " + totalGoat
                + " Кабан: " + totalHog
                + " Лошадь: " + totalHorse
                + " Мышь: " + totalMouse
                + " Заяц: " + totalRabbit
                + " Овца: " + totalSheep
                + " Медведь: " + totalBear
                + " Удав: " + totalBoa
                + " Орел: " + totalEagle
                + " Лиса: " + totalFox
                + " Волк: " + totalWolf
        );
    }

    public int getAnimalInformation(Animal animal) {
        if (animal instanceof Buffalo) return totalBuffalo;
        if (animal instanceof Caterpillar) return totalCaterpillar;
        if (animal instanceof Deer) return totalDeer;
        if (animal instanceof Duck) return totalDuck;
        if (animal instanceof Goat) return totalGoat;
        if (animal instanceof Hog) return totalHog;
        if (animal instanceof Horse) return totalHorse;
        if (animal instanceof Mouse) return totalMouse;
        if (animal instanceof Rabbit) return totalRabbit;
        if (animal instanceof Sheep) return totalSheep;
        if (animal instanceof Bear) return totalBear;
        if (animal instanceof Boa) return totalBoa;
        if (animal instanceof Eagle) return totalEagle;
        if (animal instanceof Fox) return totalFox;
        if (animal instanceof Wolf) return totalWolf;
        return -1;
    }
}
