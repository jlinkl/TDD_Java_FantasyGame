package Player.magic;

import Player.ArmourType;
import Player.Character;
import Player.IAttacker;
import Player.magic.creature.Creature;
import Player.magic.spell.Spell;
import Room.enemy.EnemyRoom;
import Room.enemy.enemies.Enemy;

public class Magic extends Character implements IAttacker {
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
        this.spell = spell;
    }

    public void changeCreature(Creature creature) {
        this.creature = creature;
    }

    public void dealDamage(Enemy enemy, EnemyRoom enemyRoom) {
        enemy.takeDamage(this.spell.getSpellType().getDamageValue(), enemyRoom);
    }



}
