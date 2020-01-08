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

    GreenfootSound backgroundMusic = new GreenfootSound("RaMxGF.mp3");
    Bosshealthbar bosshealthbar = new Bosshealthbar();
    
    public Sewers() {
        super();
        //Sound
        backgroundMusic.playLoop();
        addObject(WorldController.getCatHero(), 50, 50);
        //addHealthbar
        Healthbar healthbar = new Healthbar();
        addObject(healthbar,296,68);

        addObject(new SunGlasses(), 600, 600);

        //TunnelVision
        // tunnelVision tunnelVision = new tunnelVision();
        // addObject(tunnelVision,1141,364);

        //Map-Design
        addObject(new SewerParts1(), 305, 396);
        addObject(new SewerParts2(), 223, 585);
        addObject(new SewerParts3(), 832, 91);
        addObject(new SewerParts4(), 308, 241);
        //addObject(new SewerParts5(), 24, 208);
        addObject(new SewerParts6(), 459, 556);
        addObject(new SewerParts7(), 588, 556);
        addObject(new SewerParts8(), 1029, 604);
        addObject(new SewerParts9(), 864, 763);
        addObject(new SewerParts10(), 1314, 720);
        addObject(new SewerParts11(), 1591, 557);
        addObject(new SewerParts12(), 746, 435);
        addObject(new SewerParts13(), 1002, 434);
        addObject(new SewerParts14(), 678, 176);
        addObject(new SewerParts15(), 1050, 174);
        addObject(new SewerParts16(), 1581, 171);
        addObject(new SewerParts17(), 604, 695);
        addObject(new SewerParts17(), 1481, 695);
        addObject(new SewerParts18(), 1509, 385);
        addObject(new SewerParts19(), 1442, 314);
        addObject(new SewerParts20(), 1465, 291);

        //TunnelVision
        tunnelVision tunnelVision = new tunnelVision();
        addObject(tunnelVision,1141,364);
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
            addObject(new Rat(), Greenfoot.getRandomNumber(100) + xMin, Greenfoot.getRandomNumber(50) + yMin);
        }
    }

   
}
