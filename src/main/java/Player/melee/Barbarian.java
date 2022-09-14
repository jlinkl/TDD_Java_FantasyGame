package Player.melee;

import Player.ArmourType;
import Player.melee.weapon.Weapon;

public class Barbarian extends Warrior{
    public Barbarian(String name, ArmourType armourType, Weapon weapon, int health) {
        super(name, armourType, weapon, health);
    }
}
