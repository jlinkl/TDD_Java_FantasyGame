package Player.healer;

import Player.ArmourType;
import Player.Character;
import Player.healer.item.Item;

public class Cleric extends Character {
    private Item item;

    public Cleric(String name, ArmourType armourType, Item item) {
        super(name, armourType);
        this.item = item;
    }

    public void changeItem(Item item) {

    }
}
