import Player.ArmourType;
import Player.melee.Knight;
import Player.melee.weapon.Weapon;
import Player.melee.weapon.WeaponType;
import Room.enemy.EnemyRoom;
import Room.enemy.enemies.Enemy;
import Room.enemy.enemies.EnemyType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {


    Knight knight;

    Enemy enemy;

    Weapon weapon;

    EnemyRoom enemyRoom;

    @Before
    public void setUp() {
        weapon = new Weapon(WeaponType.SWORD);
        knight = new Knight("Arthur", ArmourType.HEAVY, weapon, 100);
        enemy = new Enemy(EnemyType.ORC);
        enemyRoom = new EnemyRoom();
    }


    @Test
    public void playerCanAttack() {
        enemyRoom.addEnemy(enemy);
        knight.dealDamage(enemy, enemyRoom);
        assertEquals(195, enemy.getHealth());
    }

    @Test
    public void playersCanTakeDamage() {
        knight.takeDamage(enemy);
        assertEquals(90, knight.getHealth());
    }
}
