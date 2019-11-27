
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
    private static boolean bossWaveReady = true;
    private static boolean itemSpawned = false;
    private static int x;
    private static int y;
    
    public House() {
        super();
        addObject(new CatHero(), 751, 542);
        spawnEnemy(EnemyType.MOUSE, 2);
        this.showText("Welle 1", 700, 25);
        killableEnemies = 7;
        //Leveldesign starts here
        addObject(new Shelf2(), 200, 30);
        addObject(new ShelfKitchen(), 260, 30);
        addObject(new Couch(), 260, 400);
        addObject(new UpperLeftPiece(), 294, 62);
        addObject(new UpperMiddle(), 707, 97);
        addObject(new UpperRightPiece(), 1209, 66);
        addObject(new Bed(), 1058, 172);
        addObject(new Bed(), 1245, 172);
        //addHealthbar
        Healthbar healthbar = new Healthbar();
        addObject(healthbar,275,75);
    }

    public void act() {
        if (killedEnemies >= 2 && secondWaveReady) {
            spawnEnemy(EnemyType.MOUSE, 2);
            this.showText("Welle 2", 700, 25);
            secondWaveReady = false;
        }
        if (killedEnemies >= 4 && thirdWaveReady) {
            spawnEnemy(EnemyType.MOUSE, 2);
            this.showText("Welle 3", 700, 25);
            thirdWaveReady = false;
        }
        if (killedEnemies >= 6 && bossWaveReady) {
            spawnEnemy(EnemyType.BOSSMOUSE, 1);
            bossWaveReady = false;
        }
        checkForNextWorld(this);
    }

}

