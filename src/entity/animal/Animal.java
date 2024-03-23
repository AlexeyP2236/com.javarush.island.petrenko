package entity.animal;

import entity.animal.action.Reproduce;
import entity.animal.action.Eat;
import entity.Plant;
import entity.animal.herbivore.Caterpillar;
import island.Location;
import util.Clearing;

import java.util.*;

public abstract class Animal {
    private int id;
    private String animalName;
    private double weight;
    private int quantitySpeed;
    private int speed;
    private boolean endSpeed;
    private boolean hunger;
    private boolean saturation;
    private double quantitySaturation;
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

    public int getQuantitySpeed() {
        return quantitySpeed;
    }

    public void setQuantitySpeed(int quantitySpeed) {
        this.quantitySpeed = quantitySpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isEndSpeed() {
        return endSpeed;
    }

    public void setEndSpeed(boolean endSpeed) {
        this.endSpeed = endSpeed;
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

    public double getQuantitySaturation() {
        return quantitySaturation;
    }

    public void setQuantitySaturation(double quantitySaturation) {
        this.quantitySaturation = quantitySaturation;
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
        if (getQuantitySaturation() < getMaxSaturation()) {
            setQuantitySaturation(new Eat(this).probabilityEaten(animalsOnLocation, plantOnLocation, getQuantitySaturation()));
        }
        setHunger(quantitySaturation == 0);
    }

    public void reproduce(List<Animal> animalsOnLocation) {
        if (getQuantitySaturation() >= getMaxSaturation()) {
            new Reproduce(this).reproduce(animalsOnLocation);
        }
    }

    // lock когда ходы у всех закончатся
    // обнулить насыщение
    public void move(Location[][] locations, List<Animal> animalsOnLocation, List<Plant> plantOnLocation, int height, int width) {
       // if (isDead() || isEndSpeed()) return;
        if (this instanceof Caterpillar) {
            if (!isSaturation()) {
                setSaturation(true);
                new Reproduce(this).reproduce(animalsOnLocation);
            }
            return;
        }
        //тут думаю остановить и чтобы другие отработали
        // перепроверить
        eat(animalsOnLocation, plantOnLocation);
        reproduce(animalsOnLocation);
        if (isHunger() && getQuantitySpeed() == 0) {
            setDead(true);
            Clearing.addAnimalDead(this);
        } else if (getQuantitySpeed() == 0) {
            setEndSpeed(true);
            return;
        }

        //right
        if (true) {
        }

    }
}
