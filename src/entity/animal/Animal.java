package entity.animal;

import action.Eat;
import action.Move;
import action.Reproduce;
import entity.Plant;
import island.Location;
import island.information.GeneralInformation;
import util.Clearing;

import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class Animal {
    private final int id;
    private String animalName;
    private double weight;
    private int quantitySpeed;
    private int speed;
    private boolean endSpeed;
    private boolean hunger;
    private boolean saturation;
    private double quantitySaturation;
    private double maxSaturation;
    private int maxQuantity;
    private boolean predator;
    private boolean deadOrEmpty;
    private Map<String, Integer> luck;

    public Animal(int id) {
        this.id = id;
        this.quantitySpeed = getSpeed();
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

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
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

    public boolean isDeadOrEmpty() {
        return deadOrEmpty;
    }

    public void setDeadOrEmpty(boolean deadOrEmpty) {
        this.deadOrEmpty = deadOrEmpty;
    }

    public void eat(Set<Animal> animalsOnLocation, List<Plant> plantOnLocation) {
        if (getQuantitySaturation() < getMaxSaturation()) {
            setQuantitySaturation(new Eat(this).probabilityEaten(animalsOnLocation, plantOnLocation, getQuantitySaturation()));
        }
        setHunger(quantitySaturation == 0);
    }

    public void reproduce(Set<Animal> animalsOnLocation, GeneralInformation information) {
        if (getQuantitySaturation() >= getMaxSaturation() && getMaxQuantity() >= information.getAnimalInformation(this)) {
            new Reproduce(this).reproduce(animalsOnLocation);
        }
    }

    public void move(Location[][] locations, int height, int width) {
        if (isHunger() && getQuantitySpeed() == 0) {
            setDeadOrEmpty(true);
            Clearing.addAnimalDeadOrEmpty(this);
            return;
        } else if (getQuantitySpeed() == 0) {
            setEndSpeed(true);
            return;
        }
        new Move(this).randomMove(locations, height, width);
        setQuantitySpeed(getQuantitySpeed() - 1);
    }
}
