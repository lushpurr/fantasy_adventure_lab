package Characters.Sorcerers;

public enum SpellType {
    WAND(1, 0),
    PUSH(3, 1),
    LIGHTNING_BOLT(3, 2),
    RING_OF_DEATH(6, 2),
    INTIMIDATION(0, 7);

    private final int damage;
    private final int fear;

    SpellType(int damage, int fear) {
        this.damage = damage;
        this.fear = fear;
    }

    public int getDamage(){ return this.damage;}

    public int getFear(){return this.fear;}
}
