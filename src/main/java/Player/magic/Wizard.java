package Player.magic;

import Player.ArmourType;
import Player.magic.creature.Creature;
import Player.magic.spell.Spell;

public class Wizard extends Magic{
    public Wizard(String name, ArmourType armourType, Spell spell, Creature creature, int mana, int health) {
        super(name, armourType, spell, creature, mana, health);
    }
}
