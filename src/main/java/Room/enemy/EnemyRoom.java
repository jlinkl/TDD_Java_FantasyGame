package Room.enemy;

import Room.enemy.enemies.Enemy;

import java.util.ArrayList;

public class EnemyRoom {
    private ArrayList<Enemy> enemies;

    public EnemyRoom() {
        this.enemies = new ArrayList<>();
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void addEnemy(Enemy enemy) {
        this.enemies.add(enemy);
    }
}
