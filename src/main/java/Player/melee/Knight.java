package Player.melee;

import Player.ArmourType;
import Player.IPlayer;
import Player.melee.weapon.Weapon;

public class Knight extends Warrior {
    public Knight(String name, ArmourType armourType, Weapon weapon, int health) {
        super(name, armourType, weapon, health);
    }
}
