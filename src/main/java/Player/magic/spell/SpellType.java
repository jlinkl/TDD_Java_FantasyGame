package Player.magic.spell;

public enum SpellType {
    FIREBALL(15, 10),
    THUNDERBOLT(20, 15),
    FROST(10,5);

    private int damageValue;

    private int manaCost;

    SpellType(int damageValue, int manaCost) {
        this.damageValue = damageValue;
        this.manaCost = manaCost;
    }
}
