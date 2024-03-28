package entity;

public class Plant {
    final long id;

    private double weight = 1;
    private boolean plantEaten;
    public Plant(long id){
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isPlantEaten() {
        return plantEaten;
    }

    public void setPlantEaten(boolean plantEaten) {
        this.plantEaten = plantEaten;
    }
}
