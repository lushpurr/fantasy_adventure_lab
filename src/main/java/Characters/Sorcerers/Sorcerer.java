package Characters.Sorcerers;
import Characters.Character;
import Rooms.Room;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Sorcerer extends Character{
    private ArrayList<Spell> spells;
    private Spell currentSpell;
    private Spell defaultWand;

    public Sorcerer(String name, int health, int fear, Room currentRoom, Spell currentSpell) {
        super(name, health, fear, currentRoom);
        this.spells = new ArrayList<Spell>(Arrays.asList(defaultWand = new Spell(SpellType.WAND)));
        this.currentSpell = currentSpell;
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<Spell> spells) {
        this.spells = spells;
    }

    public Spell getCurrentSpell() {
        return currentSpell;
    }

    public void setCurrentSpell(Spell currentSpell) {
        this.currentSpell = currentSpell;
    }

    public Spell getDefaultWand() {
        return defaultWand;
    }

    public void setDefaultWand(Spell defaultWand) {
        this.defaultWand = defaultWand;
    }

    public void attack(Character enemy){
        enemy.reduceHealth(this.currentSpell.getDamage());
    }
}
