package Player.magic.spell;

public enum SpellType {
    FIREBALL(15, 10),
    THUNDERBOLT(20, 15),
    FROST(10,5);

    SpellType(int damageValue, int manaCost) {
    }
}
