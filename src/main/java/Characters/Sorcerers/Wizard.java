package Characters.Sorcerers;

import Rooms.Room;

public class Wizard extends Sorcerer{
    public Wizard(String name, int health, int fear, Room currentRoom, Spell currentSpell) {
        super(name, health, fear, currentRoom, currentSpell);
    }
}
