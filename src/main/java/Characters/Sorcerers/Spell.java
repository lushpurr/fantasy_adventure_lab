package Characters.Sorcerers;

public class Spell {

    private SpellType spell;

    public Spell(SpellType spell){
        this.spell = spell;
    }

    public SpellType getSpell(){return spell;}

    public int getDamage(){ return spell.getDamage();}
}
