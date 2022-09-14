package Player.magic;

import Player.ArmourType;
import Player.Character;
import Player.magic.creature.Creature;
import Player.magic.spell.Spell;

public class Magic extends Character {
    private Spell spell;
    private Creature creature;
    private int mana;

    public Magic(String name, ArmourType armourType, Spell spell, Creature creature, int mana, int health) {
        super(name, armourType, health);
        this.spell = spell;
        this.creature = creature;
        this.mana = mana;
    }

    public void changeSpell(Spell spell) {

    }

    public void changeCreature(Creature creature) {

    }
}
