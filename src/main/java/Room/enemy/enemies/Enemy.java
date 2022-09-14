package Room.enemy.enemies;

import Player.IAttacker;
import Player.melee.weapon.Weapon;
import Room.enemy.EnemyRoom;

public class Enemy {
    private EnemyType enemyType;


    private int health;

    public Enemy(EnemyType enemyType) {
        this.enemyType = enemyType;
        this.health = enemyType.getHealthvalue();
    }

    public EnemyType getEnemyType() {
        return enemyType;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage, EnemyRoom enemyRoom) {
        this.health -= damage;
        if(this.health <= 0){
            this.checkIfDead(enemyRoom);
        }

    }

    public String checkIfDead(EnemyRoom enemyRoom) {
            enemyRoom.getEnemies().remove(this);
            return "Enemy is Dead!";
    }
}
