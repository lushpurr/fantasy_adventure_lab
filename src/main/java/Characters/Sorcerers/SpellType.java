package Characters.Sorcerers;

public enum SpellType {
    WAND(1),
    PUSH(3),
    LIGHTNING_BOLT(3),
    RING_OF_DEATH(6);

    private final int damage;

    SpellType(int damage) {this.damage = damage;}

    public int getDamage(){ return this.damage;}
}
