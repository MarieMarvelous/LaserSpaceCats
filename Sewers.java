import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sewers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sewers extends CatWorld {
    private static boolean secondWaveReady = true;
    private static boolean thirdWaveReady = true;


    public Sewers() {
        super();
        killableEnemies = 3;
        addObject(new CatHero(), 50, 50);
        spawnedEnemy();
    }
    
    public void act() {
        if (killedEnemies >= 2 && secondWaveReady) {
            spawnEnemy(EnemyType.RAT, 2);
            secondWaveReady = false;
        }
        if (killedEnemies >= 4 && thirdWaveReady) {
            spawnEnemy(EnemyType.RAT, 2);
            thirdWaveReady = false;
        }//Beide if-methoden
        checkForNextWorld(this);
    }
    
    public void spawnedEnemy() {
        for (int i = 1; i <= killableEnemies; i++) {            
            addObject(new Mouse(), Greenfoot.getRandomNumber(750) + 25, 400);
        }
    }
}
