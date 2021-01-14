package CharacterTests;

import Characters.Warriors.Dwarf;
import Characters.Warriors.WeaponType;
import Rooms.Room;
import com.sun.beans.WeakCache;
import org.junit.Before;
import org.junit.Test;

public class DwarfTest {
    Dwarf dwarf;
    Room room;


    @Before
    public void setUp(){

        room = new Room();
        dwarf = new Dwarf("Gimley", 10, 0, room, WeaponType.AXE);
    }

    @Test




}
