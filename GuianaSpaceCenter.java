
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GuianaSpaceCenter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class GuianaSpaceCenter extends CatWorld {
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
    Bosshealthbar bosshealthbar = new Bosshealthbar();

    public GuianaSpaceCenter() {
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

        //Sound
        SoundController.startSound("RaMxGF.mp3", true);
        addObject(WorldController.getCatHero(), 1388, 780);

        addObject(new Blocking(48, 800), 24, 400);
        addObject(new Blocking(54, 800), 1573, 400);
        addObject(new Blocking(325, 117), 209, 58);
        addObject(new Blocking(48, 800), 24, 400);
        addObject(new Blocking(1017, 117), 1037, 58);
        addObject(new Blocking(32, 32), 556, 143);
        addObject(new Blocking(32, 32), 662, 193);
        addObject(new Blocking(51, 96), 610, 164);
        addObject(new Blocking(102, 100), 688, 118);
        addObject(new Blocking(38, 61), 825, 127);
        addObject(new Blocking(420, 47), 1218, 136);
        addObject(new Blocking(52, 548), 1091, 377);
        addObject(new Blocking(372, 336), 1304, 388);
        addObject(new Blocking(479, 189), 826, 507);
        addObject(new Blocking(53, 98), 609, 364);
        addObject(new Blocking(1283, 97), 689, 751);
        addObject(new Blocking(109, 99), 1493, 750);
        addObject(new Blocking(262, 38), 828, 685);
        addObject(new Blocking(52, 48), 611, 678);
        addObject(new Blocking(51, 91), 770, 264);
        addObject(new Blocking(37, 48), 1041, 388);
        addObject(new Blocking(52, 95), 878, 264);
        addObject(new Blocking(29, 59), 930, 218);
        addObject(new Blocking(106, 96), 1224, 603);
        addObject(new Blocking(106, 96), 1386, 603);
        addObject(new Blocking(33, 43), 1465, 574);
        addObject(new Blocking(33, 43), 1145, 574);
        addObject(new Blocking(424, 50), 257, 678);
        addObject(new Blocking(105, 49), 102, 630);
        addObject(new Blocking(26, 36), 74, 580);
        addObject(new Blocking(266, 342), 182, 286);
        addObject(new Blocking(54, 93), 336, 409);
        addObject(new Blocking(28, 60), 342, 265);
        addObject(new Blocking(28, 60), 342, 123);
        addObject(new Blocking(93, 67), 209, 513);
        addObject(new Blocking(107, 79), 102, 500);

        //Leveldesign startet hier
        /*addObject(new SpaceCenterBed(), 878, 264);
        addObject(new SpaceCenterBed(), 292, 312);
        addObject(new SpaceCenterBed(), 184, 313);
        addObject(new SpaceCenterBed(), 290, 167);
        addObject(new SpaceCenterBed(), 184, 167);
        addObject(new SpaceCenterDownElements(), 931, 507);
        addObject(new SpaceCenterDownLeft(), 79, 701);
        addObject(new SpaceCenterDownMiddle(), 316, 688);
        addObject(new SpaceCenterDown(), 665, 749);
        addObject(new SpaceCenterEntrance(), 1521, 750);
        addObject(new SpaceCenterLeft(), 27, 401);
        addObject(new SpaceCenterMiddleElements(), 1304, 385);
        addObject(new SpaceCenterPfeiler(), 610, 115);
        addObject(new SpaceCenterSchrank(), 1037, 387);
        addObject(new SpaceCenterRight(), 1573, 400);
        addObject(new SpaceCenterSichtschirm(), 687, 120);
        addObject(new SpaceCenterSpinde(), 1273, 121);
        addObject(new SpaceCenterTisch(), 771, 259);
        addObject(new SpaceCenterTop(), 1092, 59);
        addObject(new SpaceCenterUpperMiddle(), 183, 406);
        addObject(new SpaceCenterUpperMiddle2(), 129, 501);
        addObject(new SpaceCenterChairs(), 1415, 578);
        addObject(new SpaceCenterWhatEverThatIs(), 1224, 627);
        addObject(new SpaceCenterWhatEverThatIs(), 1384, 626);
        addObject(new SpaceCenterMiddleWall(), 1089, 326);
        addObject(new SpaceCenterChairs2(), 827, 688);
        addObject(new SpaceCenterTopRight(), 187, 58);
        addObject(new SpaceCenterBedsLeft(), 184, 160);
        addObject(new SpaceCenterBedsBottom(), 184, 314);
        addObject(new SpaceCenterPfeilerUnten(), 610, 676);
        addObject(new SpaceCenterWaage(), 1039, 136);
        addObject(new SpaceCenterPfeilerOben(), 612, 384);
        addObject(new SpaceCenterTrashcan(), 556, 145);
        addObject(new SpaceCenterTrashcan2(), 662, 191);
        addObject(new SpaceCenterUpperMiddle2a(), 556, 59);
        addObject(new SpaceCenterTrashcan2(), 74, 579);*/

        //addHealthbar
        Healthbar healthbar = new Healthbar();
        addObject(healthbar,296,68);
    }

    public void act() {
        if (firstWaveReady) {
            spawnedEnemy(4, 471, 259);
            firstWaveReady = false;
        }
        if (killedEnemies >= 4 && secondWaveReady) {
            spawnedEnemy(3, 319, 579);
            secondWaveReady = false;
        }
        if (killedEnemies >= 7 && thirdWaveReady) {
            spawnedEnemy(5, 859, 633);
            thirdWaveReady = false;
        }

        if (killedEnemies >= 12 && fourthWaveReady) {
            spawnedEnemy(7, 824, 343);
            fourthWaveReady = false;
        }

        if (killedEnemies >= 19 && fithWaveReady) {
            spawnedEnemy(8, 471, 259);
            fithWaveReady = false;
        }
        if (killedEnemies >= 27 && sixthWaveReady) {
            spawnedEnemy(8, 824, 343);
            sixthWaveReady = false;
        }
        if (killedEnemies >= 35 && seventhWaveReady) {
            spawnedEnemy(8, 319, 579);
            seventhWaveReady = false;
        }
        if (killedEnemies >= 43 && eigthWaveReady) {
            spawnedEnemy(10, 859, 633);
            eigthWaveReady = false;
        }

        if (killedEnemies >= 53 && bossWaveReady) {
            addObject(new BossScientist(), 467, 429);
            addObject(new Bosshealthbar(),800,100);
            bossWaveReady = false;
        }
    }

    public void spawnedEnemy(int n, int xMin, int yMin) {
        for (int i = 0; i < n; i++) {            
            addObject(new Ape(), Greenfoot.getRandomNumber(25)+xMin, Greenfoot.getRandomNumber(25)+yMin);
        }
    }
}