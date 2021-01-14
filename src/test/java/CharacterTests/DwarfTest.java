package CharacterTests;

import Characters.Warriors.Dwarf;
import Characters.Warriors.Weapon;
import Characters.Warriors.WeaponType;
import Rooms.Room;
import com.sun.beans.WeakCache;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DwarfTest {
    Dwarf dwarf;
    Room room;
    Weapon fist;


    @Before
    public void setUp(){

        fist = new Weapon(WeaponType.FIST);

        room = new Room();
        dwarf = new Dwarf("Gimley", 10, 0, room, fist);
    }

    @Test
    public void canBeAttacked__true(){
        assertEquals(true, dwarf.getCanBeAttacked());
    }

    @Test
    public void canBeAttacked__false(){
        dwarf.goInvisible();
        assertFalse(dwarf.getCanBeAttacked());
    }

    @Test
    public void weaponListStartsEmpty(){
        assertEquals(0, dwarf.countWeapons());

    }

    @Test
    public void canAddWeapon



}
