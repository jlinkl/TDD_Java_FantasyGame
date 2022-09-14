import Player.ArmourType;
import Player.healer.Cleric;
import Player.healer.item.Item;
import Player.healer.item.ItemType;
import Room.treasure.TreasureRoom;
import Room.treasure.treasures.Treasure;
import Room.treasure.treasures.TreasureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TreasureTest {

    Treasure treasure;
    TreasureRoom treasureRoom;
    Cleric cleric;
    Item item;

    @Before
    public void before() {
        treasure = new Treasure(TreasureType.DIAMOND);
        treasureRoom = new TreasureRoom();
        item = new Item(ItemType.HERB);
        cleric = new Cleric("bob", ArmourType.CLOTH, item, 100);
    }

    @Test
    public void playerCanTakeTreasure() {
        treasureRoom.addTreasure(treasure);
        treasureRoom.addTreasureToPlayer(cleric);
        assertEquals(200, cleric.getMoney());
        assertEquals(0, treasureRoom.getTreasures().size());
    }
}
