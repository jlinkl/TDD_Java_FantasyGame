package Player.magic.spell;

public class Spell {
    private SpellType spellType;

    public Spell(SpellType spellType) {
        this.spellType = spellType;
    }

    public SpellType getSpellType() {
        return spellType;
    }
}
