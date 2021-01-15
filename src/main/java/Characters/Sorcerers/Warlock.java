package Characters.Sorcerers;

import Characters.Character;
import Characters.IIntimidate;
import Rooms.Room;

public class Warlock extends Sorcerer implements IIntimidate {


    public Warlock(String name, int health, int fear, Room currentRoom, Spell currentSpell) {
        super(name, health, fear, currentRoom, currentSpell);
    }


    public void intimidate(Character enemy) {

        enemy.increaseFear(this.getCurrentSpell().getSpell().getFear());

    }
}

