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
    private static boolean bossWaveReady = true; 
 
    public Sewers() {
        super();
        
        killableEnemies = 3;
        addObject(new CatHero(), 50, 50);
        spawnedEnemy();
        //addHealthbar
        Healthbar healthbar = new Healthbar();
        addObject(healthbar,296,68);
        
        addObject(new SunGlasses(), 600, 600);
        
        //TunnelVision
        tunnelVision tunnelVision = new tunnelVision();
        addObject(tunnelVision,1141,364);
    }
    
    public void act() {
        if (killedEnemies >= 2 && secondWaveReady) {
            spawnEnemy(EnemyType.RAT, 2);
            secondWaveReady = false;
        }
        if (killedEnemies >= 4 && thirdWaveReady) {
            spawnEnemy(EnemyType.RAT, 2);
            thirdWaveReady = false;
        }
        if(killedEnemies >= 6 && bossWaveReady) {
            //spawnEnemy(EnemyType.BOSSSLIME, 1);
            addObject(new BossSlime(),590,530 );
            bossWaveReady = false;
        }
        
        
        //Beide if-methoden
      //  checkForNextWorld(this);
    }
    
 
    
    public void spawnedEnemy() {
        for (int i = 0; i <= 2; i++) {            
            addObject(new Rat(), Greenfoot.getRandomNumber(750) + 25, 400);
        }
    }
}
