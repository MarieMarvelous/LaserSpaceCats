import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class House here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class House extends CatWorld {
    private static BlackImage fading = new BlackImage();

    private static boolean firstWaveReady = true;
    private static boolean secondWaveReady = true;
    private static boolean thirdWaveReady = true;
    private static boolean fourthWaveReady = true;
    private static boolean fithWaveReady = true;
    private static boolean sixtWaveReady = true;
    private static boolean seventhWaveReady = true;
    private static boolean sixthWaveReady = true;
    private static boolean eigthWaveReady = true;
    private static boolean bossWaveReady = true;
    private static boolean itemSpawned = false;
    
    GreenfootSound backgroundMusic = new GreenfootSound("RaMxGF.mp3");
    GreenfootSound thunderstorm = new GreenfootSound("thunderstrike.mp3");

    Bosshealthbar bosshealthbar = new Bosshealthbar();
    public House() {
        super();
        //Sound
        backgroundMusic.playLoop();
        thunderstorm.playLoop();

        addObject(WorldController.getCatHero(), 751, 542);
        //Leveldesign starts here
        addObject(new UpperLeftPiece(), 294, 62);
        addObject(new UpperRightPiece(), 1209, 66);
        addObject(new Bed(), 1058, 172);
        addObject(new Bed(), 1245, 172);

        addObject(new UpperLeftCorner(), 1446, 163);
        addObject(new UnderKitchen(), 237, 790);
        addObject(new UnderKitchenDownLeft(), 22, 782);
        addObject(new KitchenDownLeft(), 13, 746);
        addObject(new HouseMiddleDown(), 753, 780);
        addObject(new HouseWallRight(), 1327, 363);
        addObject(new HouseWallRightLong(), 1586, 490);
        addObject(new HouseCornerDownRight(), 1575, 783);
        addObject(new HouseDownMiddlePass(), 1010, 672);
        addObject(new HouseDoorDownLeft(), 493, 728);
        addObject(new HouseDoorDownRight(), 823, 737);
        addObject(new HouseDownDoorDown(), 566, 747);
        addObject(new BigBed(), 1315, 455);
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
        addObject(new HouseBedding2(), 752, 121);
        addObject(new HouseWallElement(), 637, 84);
        //addHealthbar
        Healthbar healthbar = new Healthbar();
        addObject(healthbar,275,75);
        Bosshealthbar bosshealthbar = new Bosshealthbar();

        fading.setTransparency(255);
        addObject(fading, 800, 400);
    }

    public void act() {
        if (fading.getTransparency() > 0) {
            fading.setTransparency(fading.getTransparency() - 5);
        } else {
            if (firstWaveReady) {
                spawnedEnemy(4, 20, 200);
                firstWaveReady = false;
            }
            if (killedEnemies >= 4 && secondWaveReady) {
                spawnedEnemy(3, 20, 200);
                secondWaveReady = false;
            }
            if (killedEnemies >= 7 && thirdWaveReady) {
                spawnedEnemy(5, 90,500);
                thirdWaveReady = false;
            }

            if (killedEnemies >= 12 && fourthWaveReady) {
                spawnedEnemy(7, 800,200);
                fourthWaveReady = false;
            }

            if (killedEnemies >= 19 && fithWaveReady) {
                spawnedEnemy(8, 1300,700);
                fithWaveReady = false;
            }
            if (killedEnemies >= 27 && sixthWaveReady) {
                spawnedEnemy(8, 150,600);
                sixthWaveReady = false;
            }
            if (killedEnemies >= 35 && seventhWaveReady) {
                spawnedEnemy(8, 800,200);
                seventhWaveReady = false;
            }
            if (killedEnemies >= 43 && eigthWaveReady) {
                spawnedEnemy(10, 100,700);
                eigthWaveReady = false;
            }

            if (killedEnemies >= 53 && bossWaveReady) {
                addObject(new BossMouse(), 691, 571);
                addObject(bosshealthbar,800,100);
                bossWaveReady = false;
            }        
        }

    }

    public void spawnedEnemy(int n, int xMin, int yMin) {
        for (int i = 0; i < n; i++) {            
            addObject(new Mouse(), Greenfoot.getRandomNumber(100)+xMin, Greenfoot.getRandomNumber(50)+yMin);
        }
    }
}
