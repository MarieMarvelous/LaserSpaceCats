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

    Bosshealthbar bosshealthbar = new Bosshealthbar();
    public House() {
        super();

        //init
        firstWaveReady = true;
        secondWaveReady = true;
        thirdWaveReady = true;
        fourthWaveReady = true;
        fithWaveReady = true;
        sixtWaveReady = true;
        seventhWaveReady = true;
        sixthWaveReady = true;
        eigthWaveReady = true;
        bossWaveReady = true;
        itemSpawned = false;

        //Sound
        SoundController.startSound("RaMxGF.mp3", true);
        SoundController.startSound("thunderstrike.mp3", true);

        addObject(WorldController.getCatHero(), 751, 542);
        
        //Leveldesign starts here
        addObject(new Blocking(91, 119), 1058, 172);
        addObject(new Blocking(91, 119), 1245, 172);
        addObject(new Blocking(1600, 125), 800, 57);
        addObject(new Blocking(308, 318), 1446, 163);
        addObject(new Blocking(386, 19), 237, 790);
        addObject(new Blocking(44, 36), 22, 782);
        addObject(new Blocking(27, 107), 13, 746);
        addObject(new Blocking(1050, 152), 1116, 363);
        addObject(new Blocking(26, 561), 1586, 543);
        addObject(new Blocking(89, 43), 1010, 672);
        addObject(new Blocking(87, 102), 493, 728);
        addObject(new Blocking(647, 37), 747, 781);
        addObject(new Blocking(464, 123), 823, 738);
        addObject(new Blocking(98, 71), 566, 747);
        addObject(new Blocking(140,120), 1315, 455);
        addObject(new Blocking(94,176), 825, 389);
        addObject(new Blocking(75, 428), 37, 478);
        addObject(new Blocking(90, 220), 637, 327);
        addObject(new Blocking(43, 71), 613, 447);
        addObject(new Blocking(90, 85), 682, 473);
        addObject(new Blocking(88,85), 496, 469);
        addObject(new Blocking(144, 160), 754, 97);
        addObject(new Blocking(91, 168), 637, 84);
        addObject(new Blocking(94, 162), 1012, 513);
        addObject(new Blocking(498, 16), 1326, 792);
        addObject(new Blocking(494, 186), 247, 346);
        addObject(new Blocking(281, 49), 308, 454);
        addObject(new Blocking(29, 48), 473, 654);
        addObject(new Blocking(26, 192), 13, 171);
        
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
                spawnedEnemy(4, 35, 200);
                firstWaveReady = false;
            }
            if (killedEnemies >= 4 && secondWaveReady) {
                spawnedEnemy(3, 35, 200);
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
            addObject(new Mouse(), Greenfoot.getRandomNumber(5)+xMin, Greenfoot.getRandomNumber(5)+yMin);
        }
    }
}
