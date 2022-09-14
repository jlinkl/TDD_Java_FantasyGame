package Player;

public enum ArmourType {

    HEAVY(10),
    LIGHT(2),
    CLOTH(0);

    private int defenseValue;

    ArmourType(int defenseValue) {
        this.defenseValue = defenseValue;
    }

    public int getDefenseValue() {
        return defenseValue;
    }
}
