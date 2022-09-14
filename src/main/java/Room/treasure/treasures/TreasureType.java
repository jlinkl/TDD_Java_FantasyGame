package Room.treasure.treasures;

public enum TreasureType {
    GOLD(100),
    DIAMOND(200),
    RUBBISH(0);


    private int treasureValue;

    TreasureType(int treasureValue) {
        this.treasureValue = treasureValue;

    }

    public int getTreasureValue() {
        return treasureValue;
    }
}
