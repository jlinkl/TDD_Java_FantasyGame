package Room.enemy.enemies;

public enum EnemyType {
    TROLL(100, 10),
    ORC(200, 20);

    private int healthvalue;

    private int damageValue;

    EnemyType(int healthValue, int damageValue) {
        this.healthvalue = healthValue;
        this.damageValue = damageValue;
    }

    public int getHealthvalue() {
        return healthvalue;
    }

    public int getDamageValue() {
        return damageValue;
    }
}
