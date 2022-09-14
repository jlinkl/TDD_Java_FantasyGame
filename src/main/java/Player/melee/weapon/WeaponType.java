package Player.melee.weapon;

public enum WeaponType {
    SWORD(5),
    AXE(7),
    HAMMER(10),
    GREATSWORD(12),
    MACE(8),
    DEATHSWORD(200);

    private int damageValue;

    WeaponType(int damageValue) {
        this.damageValue = damageValue;

    }

    public int getDamageValue() {
        return damageValue;
    }
}
