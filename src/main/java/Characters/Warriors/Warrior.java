package Characters.Warriors;
import Characters.Character;
import Rooms.Room;

import java.util.ArrayList;

public abstract class Warrior extends Character {
    private ArrayList<Weapon> weapons;
    private Weapon currentWeapon;


    public Warrior(String name, int health, int fear, Room currentRoom, Weapon currentWeapon) {
        super(name, health, fear, currentRoom);
        this.weapons = new ArrayList<Weapon>();
        this.currentWeapon = currentWeapon;
    }

    public ArrayList<Weapon> getWeapon() {
        return weapons;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public int countWeapons(){
        return this.weapons.size();
    }

    public void addWeapon(Weapon weapon){
        this.weapons.add(weapon);
    }

    public void removeWeapon(Weapon weapon){
        this.weapons.remove(weapon);
    }

    public Weapon getWeaponByIndex(int index){
        return this.weapons.get(index);
    }

    public int getWeaponIndexByWeapon(Weapon weapon){
        return this.weapons.indexOf(weapon);
    }

}
