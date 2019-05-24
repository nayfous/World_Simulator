package world.simulator;

public class World {

    // initialze variables
    private int width;
    private int length;
    private int max_entities;

    // constructor to initialize variables with parameters
    public World(int width, int length, int max_extities) {
        this.width = width;
        this.length = length;
        this.max_entities = max_extities;
    }

    public generateWorld() {
        // TODO create the world grid
    }

    public generateTemperatureField() {
        // TODO create a temperature gradient for the world and let it change over time
    }

    public generateFoodField() {
        // TODO create food patches on the field and its sense leading to it
    }

    public generateObstacles() {
        // TODO create obstacles in the world that hinder the entities
    }

    public generateDeadZones() {
        // TODO create locations where the entities directly die
    }
}
