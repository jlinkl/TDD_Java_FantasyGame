package Player.magic;

import Player.ArmourType;
import Player.magic.creature.Creature;
import Player.magic.spell.Spell;

public class Warlock extends Magic{
    public Warlock(String name, ArmourType armourType, Spell spell, Creature creature, int mana) {
        super(name, armourType, spell, creature, mana);
    }
}
