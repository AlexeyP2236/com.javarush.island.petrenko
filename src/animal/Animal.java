package animal;

import animal.action.Eat;
import animal.action.Move;
import animal.action.Reproduce;
import title.NamesAnimal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal implements Reproduce, Eat, Move {
    private String animalName;
    private double weight;
    private int speed;
    private boolean hunger;
    private boolean saturation;
    private double maxSaturation;
    private Map<String, Integer> luck;
    public Animal() {
    }

    //getter and setter
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
        return saturation;
    }

    public void setSaturation(boolean saturation) {
        this.saturation = saturation;
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
    public void eat(Set<Animal> animalsOnLocation) {

    }

    @Override
    public void move(List<List<Set<Animal>>> location) {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", saturation=" + saturation +
                ", maxSaturation=" + maxSaturation +
                ", luck=" + luck +
                '}';
    }
}
