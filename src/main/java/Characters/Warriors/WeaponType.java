package Characters.Warriors;

public enum WeaponType {
    BASICSWORD(2),
    LONGSWORD(5),
    CLUB(3),
    AXE(4);

    private final int damage;

    WeaponType(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return this.damage;
    }
}
