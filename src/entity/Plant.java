package entity;

public class Plant {
    final long id;

    private String plantName = "Растение";
    private double weight = 1;
    private boolean plantEaten;
    public Plant(long id){
        this.id = id;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlant(String plant) {
        this.plantName = plant;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public boolean isPlantEaten() {
        return plantEaten;
    }

    public void setPlantEaten(boolean plantEaten) {
        this.plantEaten = plantEaten;
    }
}
