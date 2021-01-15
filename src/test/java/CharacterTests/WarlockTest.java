package CharacterTests;

import Characters.Sorcerers.Spell;
import Characters.Sorcerers.SpellType;
import Characters.Sorcerers.Warlock;
import Characters.Warriors.Barbarian;
import Characters.Warriors.Weapon;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    Warlock warlock;
    Barbarian barbarian;
    Room room;
    Spell wand;
    Spell lightningBolt;
    Weapon fist;

    @Before
    public void setUp(){

        wand = new Spell(SpellType.WAND);
        lightningBolt = new Spell(SpellType.LIGHTNING_BOLT);

        room = new Room();
        warlock = new Warlock("Doris", 10, 0, room, lightningBolt);
        barbarian = new Barbarian("Bubbles", 10, 0, room, fist);

    }

    @Test
    public void canInflictDamage(){
        warlock.attack(barbarian);
        assertEquals(7, barbarian.getHealth());
    }

    @Test
    public void canIntimidate(){
        warlock.intimidate(barbarian);
        assertEquals(2, barbarian.getFear());
    }

    @Test
    public void warlockCanDamageAndIntimidate(){
        warlock.attack(barbarian);
        assertEquals(7 , barbarian.getHealth());
        assertEquals(2, barbarian.getFear());
    }
}
