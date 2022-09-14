import Player.melee.weapon.Weapon;
import Player.melee.weapon.WeaponType;
import Room.enemy.EnemyRoom;
import Room.enemy.enemies.Enemy;
import Room.enemy.enemies.EnemyType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    private Enemy enemy;

    private EnemyRoom enemyRoom;

    private Weapon weapon;

    private Weapon weapon2;


    @Before
    public void setUp() {
        enemy = new Enemy(EnemyType.ORC);
        enemyRoom = new EnemyRoom();
        weapon = new Weapon(WeaponType.AXE);
        weapon2 = new Weapon(WeaponType.DEATHSWORD);
    }


    @Test
    public void canTakeDamage(){
        enemyRoom.addEnemy(enemy);
        enemy.takeDamage(weapon.getWeaponType().getDamageValue(), enemyRoom);
        assertEquals(193, enemy.getHealth());

    }

    @Test
    public void enemyCanDie(){
        enemyRoom.addEnemy(enemy);
        enemy.takeDamage(weapon2.getWeaponType().getDamageValue(), enemyRoom);
        assertEquals(0, enemyRoom.getEnemies().size());
        assertEquals("Enemy is Dead!", enemy.checkIfDead(enemyRoom));
    }


}
