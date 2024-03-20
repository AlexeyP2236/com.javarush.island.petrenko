package animal;

import animal.action.Eat;
import animal.action.Move;
import animal.action.Reproduce;
import animal.plant.Plant;
import island.Island;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal implements Reproduce, Eat, Move {
    private int id;
    private String animalName;
    private double weight;
    private int speed;
    private boolean hunger;
    private boolean isSaturation;
    private double saturationNumber;
    private double maxSaturation;
    private Map<String, Integer> luck;

    public Animal(int id) {
        this.id = id;
    }

    //getter and setter

    public int getId() {
        return id;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isHunger() {
        return hunger;
    }

    public void setHunger(boolean hunger) {
        this.hunger = hunger;
    }

    public boolean isSaturation() {
        return isSaturation;
    }

    public void setSaturation(boolean isSaturation) {
        this.isSaturation = isSaturation;
    }

    public double getSaturationNumber() {
        return saturationNumber;
    }

    public void setSaturationNumber(double saturationNumber) {
        this.saturationNumber = saturationNumber;
    }

    public double getMaxSaturation() {
        return maxSaturation;
    }

    public void setMaxSaturation(double maxSaturation) {
        this.maxSaturation = maxSaturation;
    }

    public Map<String, Integer> getLuck() {
        return luck;
    }

    public void setLuck(Map<String, Integer> luck) {
        this.luck = luck;
    }

    public void setLuck(String s, Integer i) {
        this.luck.put(s, i);
    }

    @Override
    public void eat(Set<Animal> animalsOnLocation, int globalId) {
        if (saturationNumber < maxSaturation) {
            saturationNumber = probabilityExtraction(animalsOnLocation, getLuck(), saturationNumber);
        }
        if (saturationNumber >= maxSaturation) {
            setSaturation(true);
            for (Animal animal : animalsOnLocation) {
                if (getAnimalName().equals(animal.getAnimalName()) && isSaturation == animal.isSaturation && id != animal.getId()) {
                    setSaturation(false);
                    animal.setSaturation(false);
                    setSaturationNumber(0);
                    reproduce(animalsOnLocation, globalId);
                }
            }
        }
    }

    // слабый вариант создать новую таблицу и загрузить в нее, потом отправить назад, пока только для set, для list циклы
    // https://www.coderanch.com/t/572287/java/ConcurrentModificationException-HashSet-recursion
    public void reproduce(Set<Animal> animalsOnLocation, int id) {
        int i = ThreadLocalRandom.current().nextInt(1, 3);

        while (i > 0) {
            animalsOnLocation.add(new Plant(9));
            i--;
        }
    }

    // здесь реализовать смерть животного
    @Override
    public void move(List<List<Set<Animal>>> location) {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", animalName='" + animalName + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", hunger=" + hunger +
                ", isSaturation=" + isSaturation +
                ", saturationNumber=" + saturationNumber +
                ", maxSaturation=" + maxSaturation +
                ", luck=" + luck +
                '}';
    }
}
