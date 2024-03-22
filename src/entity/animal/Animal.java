package entity.animal;

import entity.animal.action.Reproduce;
import entity.animal.action.Eat;
import entity.animal.action.Move;
import entity.Plant;

import java.util.*;

public abstract class Animal {
    private int id;
    private String animalName;
    private double weight;
    private int speed;
    private boolean hunger;
    private boolean saturation;
    private double saturationNumber;
    private double maxSaturation;
    private boolean predator;
    private boolean dead;
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
        return saturation;
    }

    public void setSaturation(boolean isSaturation) {
        this.saturation = isSaturation;
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

    public boolean isPredator() {
        return predator;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public void eat(List<Animal> animalsOnLocation, List<Plant> plantOnLocation) {
        if (isDead()) return;
        if (getSaturationNumber() < getMaxSaturation()) {
            setSaturationNumber(new Eat(this).probabilityEaten(animalsOnLocation, plantOnLocation, getSaturationNumber()));
        }
        setHunger(saturationNumber == 0);

    }

    public void reproduce(List<Animal> animalsOnLocation) {
        if (getSaturationNumber() >= getMaxSaturation()) {
            new Reproduce(this).numberReproduce(animalsOnLocation);
        }
    }

    // не забыть про гусениц
    // здесь реализовать смерть животного
    public void move() {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", animalName='" + animalName + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", hunger=" + hunger +
                ", isSaturation=" + saturation +
                ", saturationNumber=" + saturationNumber +
                ", maxSaturation=" + maxSaturation +
                ", luck=" + luck +
                '}';
    }
}
