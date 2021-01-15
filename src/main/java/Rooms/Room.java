package Rooms;

import Creatures.Creature;
import Treasure.Treasure;

public class Room {
    private String name;
    private Treasure treasure;
    private Creature creature;

    public Room(String name, Treasure treasure, Creature creature){
        this.name = name;
        this.treasure = treasure;
        this.creature = creature;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public void setTreasure(Treasure treasure) {
        this.treasure = treasure;
    }

    public Creature getCreature() {
        return creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }
}
