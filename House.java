
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class House here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class House extends CatWorld {
    private static boolean secondWaveReady = true;
    private static boolean thirdWaveReady = true;

    public House() {
        super();
        addObject(new CatHero(), 50, 50);
        spawnEnemy(EnemyType.MOUSE, 2);
        killableEnemies = 6;
    }

    public void act() {
        if (killedEnemies >= 2 && secondWaveReady) {
            spawnEnemy(EnemyType.MOUSE, 2);
            secondWaveReady = false;
        }
        if (killedEnemies >= 4 && thirdWaveReady) {
            spawnEnemy(EnemyType.MOUSE, 2);
            thirdWaveReady = false;
        }
        checkForNextWorld(this);
    }
}
