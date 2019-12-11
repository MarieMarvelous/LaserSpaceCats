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
    private static boolean fourthWaveReady = true;
    private static boolean fithWaveReady = true;
    private static boolean bossWaveReady = true; 
    GreenfootSound backgroundMusic = new GreenfootSound("RaMxGF.mp3");
    public Sewers() {
        super();
        //Sound
        backgroundMusic.playLoop();
        killableEnemies = 3;
        addObject(new CatHero(), 50, 50);
        //addHealthbar
        Healthbar healthbar = new Healthbar();
        addObject(healthbar,296,68);
        
        addObject(new SunGlasses(), 600, 600);
        
        //TunnelVision
        tunnelVision tunnelVision = new tunnelVision();
        addObject(tunnelVision,1141,364);
    }
    
    public void act() {
        if (killedEnemies >= 1 && secondWaveReady) {
            spawnEnemy(EnemyType.RAT, 2);
            this.showText("Welle 2", 700, 25);
            secondWaveReady = false;
        }
        if (killedEnemies >= 3 && thirdWaveReady) {
            spawnEnemy(EnemyType.RAT, 3);
            this.showText("Welle 3", 700, 25);
            thirdWaveReady = false;
        }
        
        if (killedEnemies >= 6 && fourthWaveReady) {
            spawnEnemy(EnemyType.RAT, 5);
            this.showText("Welle 4", 700, 25);
            fourthWaveReady = false;
        }
        
        if (killedEnemies >= 11 && fithWaveReady) {
            spawnEnemy(EnemyType.RAT, 8);
            this.showText("Welle 5", 700, 25);
            fithWaveReady = false;
        }
            
        
        if (killedEnemies >= 19  && bossWaveReady) {
            spawnEnemy(EnemyType.BOSSSLIME, 1);
            this.showText("!!! ACHTUNG BOSS WELLE !!!", 700, 25);
            bossWaveReady = false;
        }
    }
    
    public void spawnedEnemy(int n, int xMin, int yMin) {
        for (int i = 0; i < n; i++) {            
            addObject(new Rat(), Greenfoot.getRandomNumber(750) + xMin, Greenfoot.getRandomNumber(400) + yMin);
        }
    }
    
    
   
}
