import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sewers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sewers extends CatWorld {
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

    public Sewers() {
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
        addObject(WorldController.getCatHero(), 50, 50);
        //addHealthbar
        Healthbar healthbar = new Healthbar();
        addObject(healthbar,296,68);

        addObject(new Blocking(1538, 184), 831, 92);
        addObject(new Blocking(277, 93), 1050, 231);
        addObject(new Blocking(92, 187), 679, 276);
        addObject(new Blocking(271, 106), 311, 239);
        addObject(new Blocking(276, 14), 307, 368);
        addObject(new Blocking(446, 426), 223, 587);
        addObject(new Blocking(24, 178), 457, 564);
        addObject(new Blocking(118, 173), 588, 560);
        addObject(new Blocking(27, 42), 604, 695);
        addObject(new Blocking(637, 178), 1027, 559);
        addObject(new Blocking(527, 152), 1082, 723);
        addObject(new Blocking(92, 97), 773, 695);
        addObject(new Blocking(544, 47), 1005, 439);
        addObject(new Blocking(32, 94), 1581, 232);
        addObject(new Blocking(32, 44), 1583, 439);
        addObject(new Blocking(14, 181), 1592, 561);
        addObject(new Blocking(114, 175), 1466, 560);
        addObject(new Blocking(27, 42), 1481, 696);
        addObject(new Blocking(27, 42), 1508, 386);
        addObject(new Blocking(27, 42), 1440, 315);
        addObject(new Blocking(27, 42), 1466, 290);

        //TunnelVision
        tunnelVision tunnelVision = new tunnelVision();
        //addObject(tunnelVision,1141,364);
    }

    public void act() {
        setPaintOrder(Healthbar.class, tunnelVision.class);
        if (firstWaveReady) {
            spawnedEnemy(4, 576, 313);
            firstWaveReady = false;
        }
        if (killedEnemies >= 4 && secondWaveReady) {
            spawnedEnemy(3, 1305, 319);
            secondWaveReady = false;
        }
        if (killedEnemies >= 7 && thirdWaveReady) {
            spawnedEnemy(5, 561, 738);
            thirdWaveReady = false;
        }

        if (killedEnemies >= 12 && fourthWaveReady) {
            spawnedEnemy(7, 1305, 319);
            fourthWaveReady = false;
        }

        if (killedEnemies >= 19 && fithWaveReady) {
            spawnedEnemy(8, 1440, 726);
            fithWaveReady = false;
        }
        if (killedEnemies >= 27 && sixthWaveReady) {
            spawnedEnemy(8, 576, 313);
            sixthWaveReady = false;
        }
        if (killedEnemies >= 35 && seventhWaveReady) {
            spawnedEnemy(8, 1305, 319);
            seventhWaveReady = false;
        }
        if (killedEnemies >= 43 && eigthWaveReady) {
            spawnedEnemy(10, 561, 738);
            eigthWaveReady = false;
        }

        if (killedEnemies >= 53 && bossWaveReady) {
            addObject(new BossSlime(), 1099, 352);
            addObject(bosshealthbar,800,100);
            bossWaveReady = false;
        }        
    }

    public void spawnedEnemy(int n, int xMin, int yMin) {
        for (int i = 0; i < n; i++) {            
            addObject(new Rat(), Greenfoot.getRandomNumber(25) + xMin, Greenfoot.getRandomNumber(25) + yMin);
        }
    }

}
