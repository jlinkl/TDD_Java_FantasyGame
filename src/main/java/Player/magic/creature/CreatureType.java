package Player.magic.creature;

public enum CreatureType {
    OGRE(20),
    DRAGON(30);

    private int damageValue;

    CreatureType(int damageValue) {
        this.damageValue = damageValue;
    }

    public int getDamageValue() {
        return damageValue;
    }
}
