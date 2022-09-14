package Player.healer;

import Player.ArmourType;
import Player.Character;
import Player.healer.item.Item;

public class Cleric extends Character {
    private Item item;

    public Cleric(String name, ArmourType armourType, Item item, int health) {
        super(name, armourType, health);
        this.item = item;
    }

    public void changeItem(Item item) {
        this.item = item;
    }
}
