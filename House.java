
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
        addObject(new CatHero(), 400, 149);
        spawnEnemy(EnemyType.MOUSE, 2);
        this.showText("Welle 1", 700, 25);
        killableEnemies = 7;
        //Leveldesign starts here
        addObject(new Shelf2(), 200, 30);
        addObject(new ShelfKitchen(), 260, 30);
        addObject(new Couch(), 260, 400);
        addObject(new UpperLeftPiece(), 294, 62);
        addObject(new UpperRightPiece(), 1209, 66);
        addObject(new Bed(), 1058, 172);
        addObject(new Bed(), 1245, 172);
        addObject(new UpperLeftCorner(), 1446, 163);
        addObject(new UnderKitchen(), 237, 790);
        addObject(new UnderKitchenDownLeft(), 22, 782);
        addObject(new KitchenDownLeft(), 13, 747);
        addObject(new HouseMiddleDown(), 753, 780);
        addObject(new HouseWallRight(), 1327, 363);
        addObject(new HouseWallRightLong(), 1586, 490);
        addObject(new HouseCornerDownRight(), 1575, 783);
        addObject(new HouseDownMiddlePass(), 1010, 672);
        addObject(new HouseDoorDownLeft(), 493, 728);
        addObject(new HouseDoorDownRight(), 823, 737);
        addObject(new HouseDownDoorDown(), 566, 747);
        addObject(new BigBed(), 1315, 455);
        addObject(new BigBed(), 1315, 456);
        addObject(new HouseCamin(), 825, 389);
        addObject(new HouseKitchenLeft(), 37, 478);
        addObject(new HouseKitchenMiddle(), 83, 344);
        addObject(new HouseKitchenMiddleLong(), 1141, 366);
        addObject(new HouseMiddleMiddle(), 637, 327);
        addObject(new HouseKitchenChair(), 613, 447);
        addObject(new HouseKitchenTable(), 682, 473);
        addObject(new HouseTV(), 496, 469);
        addObject(new HouseWallUpLeft(), 294, 61);
        addObject(new HouseWallUpRight(), 1210, 66);
        addObject(new HouseKitchenZeile(), 306, 366);
        //addHealthbar
        Healthbar healthbar = new Healthbar();
        addObject(healthbar,275,75);
        addObject(new Glasses(), 500, 500);
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

