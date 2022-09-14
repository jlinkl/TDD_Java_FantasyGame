package Room.treasure.treasures;

import java.util.ArrayList;

public class Treasure {
    private TreasureType treasureType;
    private int value;


    public Treasure(TreasureType treasureType) {
        this.treasureType = treasureType;
        this.value = treasureType.getTreasureValue();
    }

    public TreasureType getTreasureType() {
        return treasureType;
    }
}




