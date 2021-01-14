package Characters.Warriors;
import Characters.Character;
import Rooms.Room;

import java.util.ArrayList;

public abstract class Warrior extends Character {
    private ArrayList<WeaponType> weapons;
    private WeaponType currentWeapon;


    public Warrior(String name, int health, int fear, Room currentRoom, WeaponType currentWeapon) {
        super(name, health, fear, currentRoom);
        this.weapons = new ArrayList<WeaponType>();
        this.currentWeapon = currentWeapon;
    }

    public ArrayList<WeaponType> getWeapon() {
        return weapons;
    }

    public WeaponType getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(WeaponType currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public int countWeapons(){
        return this.weapons.size();
    }

    public void addWeapon(WeaponType weapon){
        this.weapons.add(weapon);
    }

    public void removeWeapon(WeaponType weapon){
        this.weapons.remove(weapon);
    }

    public WeaponType getWeaponByIndex(int index){
        return this.weapons.get(index);
    }

    public int getWeaponIndexByWeapon(WeaponType weapon){
        return this.weapons.indexOf(weapon);
    }

}
