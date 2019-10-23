import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Garden here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Garden extends CatWorld {  
    private static boolean secondWaveReady = true;
    private static boolean thirdWaveReady = true;


    public Garden() {
        super();
        //Spawn Objects in World
        addObject(new CatHero(),400,225);
        spawnEnemy(EnemyType.RAT, 2);
        killableEnemies = 6;

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
            addObject(new Rat(), Greenfoot.getRandomNumber(750) + 25, 400);
        }
    }
}
