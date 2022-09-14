package Player.melee;

import Player.ArmourType;
import Player.Character;
import Player.melee.weapon.Weapon;

public class Warrior extends Character {
    private Weapon weapon;

    public Warrior(String name, ArmourType armourType, Weapon weapon) {
        super(name, armourType);
        this.weapon = weapon;
    }

    public void swapWeapon(Weapon weapon) {

    }
}
