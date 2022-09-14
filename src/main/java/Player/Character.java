package Player;

import Room.enemy.enemies.Enemy;
import Room.treasure.treasures.Treasure;

public abstract class Character implements IPlayer {
    protected String name;
    protected ArmourType armourType;
    private int health;
    private int money;

    public Character(String name, ArmourType armourType, int health) {
        this.name = name;
        this.armourType = armourType;
        this.health = health;
        this.money = 0;

    }

    public String getName() {
        return name;
    }

    public ArmourType getArmourType() {
        return armourType;
    }
    public void reduceHealth(int damageValue) {
        if (damageValue - this.armourType.getDefenseValue() > 0) {
            this.health -= (damageValue - this.armourType.getDefenseValue());
        }
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(Treasure treasure) {
        this.money += treasure.getTreasureType().getTreasureValue();
    }

    public void takeDamage(Enemy enemy) {
        this.reduceHealth(enemy.getEnemyType().getDamageValue());
    }

    public void dealDamage(Enemy enemy) {

    }
}
