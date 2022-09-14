package Player;

import Room.enemy.enemies.Enemy;
import Room.treasure.treasures.Treasure;

public interface IPlayer {
    public void addMoney(Treasure treasure);
    public void takeDamage(Enemy enemy);

}
