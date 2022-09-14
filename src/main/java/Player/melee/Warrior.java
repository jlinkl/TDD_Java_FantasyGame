package Player.melee;

import Player.ArmourType;
import Player.Character;
import Player.melee.weapon.Weapon;
import Room.enemy.enemies.Enemy;

public class Warrior extends Character {
    private Weapon weapon;

    public Warrior(String name, ArmourType armourType, Weapon weapon, int health) {
        super(name, armourType, health);
        this.weapon = weapon;
    }

    public void swapWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attackEnemy(Enemy enemy) {

    }


}
