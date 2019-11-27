import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Moon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moon extends CatWorld {
    private static boolean secondWaveReady = true;
    private static boolean thirdWaveReady = true;
    GreenfootSound backgroundMusic = new GreenfootSound("RaMxGF.mp3");
    public Moon() {
    super();
        //Sound
        backgroundMusic.playLoop();
        addObject(new CatHero(), 50, 50);
        killableEnemies = 4;
        spawnedEnemy();
        //addHealthbar
        Healthbar healthbar = new Healthbar();
        addObject(healthbar,296,68);
        
        addObject(new Keycard(), 500, 100);
    }
    
    public void act() {
        if (killedEnemies >= 2 && secondWaveReady) {
            spawnEnemy(EnemyType.DINOSAUR, 2);
            secondWaveReady = false;
        }
        if (killedEnemies >= 4 && thirdWaveReady) {
            spawnEnemy(EnemyType.DINOSAUR, 2);
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
