package Characters.Sorcerers;
import Characters.Character;
import Rooms.Room;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Sorcerer extends Character{
    private ArrayList<Spell> spells;
    private Spell currentSpell;
    private Spell defaultWand;

    public Sorcerer(String name, int health, int fear, Room currentRoom) {
        super(name, health, fear, currentRoom);
        this.spells = new ArrayList<Spell>(Arrays.asList(defaultWand = new Spell(SpellType.WAND)))
    }


}
