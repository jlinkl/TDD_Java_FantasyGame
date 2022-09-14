package Player.healer.item;

public enum ItemType {
    HERB(10),
    POTION(20);

    private int healValue;

    ItemType(int healValue) {
        this.healValue = healValue;
    }

    public int getHealValue() {
        return healValue;
    }
}
