import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GuianaSpaceCenter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class GuianaSpaceCenter extends CatWorld {
    private static boolean secondWaveReady = true;
    private static boolean thirdWaveReady = true;
    GreenfootSound backgroundMusic = new GreenfootSound("RaMxGF.mp3");
    public GuianaSpaceCenter() {
        super();
        //Sound
        backgroundMusic.playLoop();
        addObject(new CatHero(), 1388, 780);
        killableEnemies = 2;
        spawnedEnemy();   
        //Leveldesign startet hier
        addObject(new Left(), 26, 401);
        
        
        
        //addHealthbar
        Healthbar healthbar = new Healthbar();
        addObject(healthbar,296,68);
        
        addObject(new Spacehelm(), 400, 700);
    }
    
    public void act() {
        if (killedEnemies >= 2 && secondWaveReady) {
            spawnEnemy(EnemyType.APE, 2);
            secondWaveReady = false;
        }
        if (killedEnemies >= 4 && thirdWaveReady) {
            spawnEnemy(EnemyType.APE, 2);
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