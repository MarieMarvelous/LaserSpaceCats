import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Moon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moon extends CatWorld {
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

    public Moon() {
        super();
        //Sound
        SoundController.startSound("RaMxGF.mp3", true);
        addObject(WorldController.getCatHero(), 800, 500);
        addObject(new DeathStar(),1240,724);
        addObject(new Triceratops(), 250, 524);
        //addHealthbar
        Healthbar healthbar = new Healthbar();
        addObject(healthbar,296,68);
        prepare();
        //WorldController.setCurrentLevel(this);
    }

    public void act() {

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
            spawnedEnemy(8, 1000,700);
            fithWaveReady = false;
        }
        if (killedEnemies >= 27 && sixthWaveReady) {
            spawnedEnemy(8, 30,600);
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
            addObject(new BossNapoleon(), 691, 571);
            addObject(new Bosshealthbar(),800,100);
            bossWaveReady = false;
        }

    }

    public void spawnedEnemy(int n, int xMin, int yMin) {
        for (int i = 0; i < n; i++) {            
            addObject(new Dinosaur(), Greenfoot.getRandomNumber(25)+xMin, Greenfoot.getRandomNumber(25)+yMin);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        TriceratopsTurned triceratopsTurned = new TriceratopsTurned();
        addObject(triceratopsTurned,723,138);
        triceratopsTurned.setLocation(671,82);
        Stone stone = new Stone();
        addObject(stone,872,90);
        stone.setLocation(958,173);
        Stone stone2 = new Stone();
        addObject(stone2,78,459);
        stone2.setLocation(62,438);
        Stone stone3 = new Stone();
        addObject(stone3,940,716);
        stone3.setLocation(998,767);
        Stone stone4 = new Stone();
        addObject(stone4,110,188);
        stone4.setLocation(144,136);
        Stone stone5 = new Stone();
        addObject(stone5,1315,237);
        stone5.setLocation(1294,284);
        Stone stone6 = new Stone();
        addObject(stone6,1295,471);
        stone6.setLocation(1189,445);
        Stone stone7 = new Stone();
        addObject(stone7,557,237);
        stone7.setLocation(594,239);
        Stone stone8 = new Stone();
        addObject(stone8,1461,718);
        stone8.setLocation(1367,637);
        Stone stone9 = new Stone();
        addObject(stone9,705,722);
        stone9.setLocation(751,781);
        BrokenSpaceStation brokenSpaceStation = new BrokenSpaceStation();
        addObject(brokenSpaceStation,1077,114);
        BrokenSpaceStation brokenSpaceStation2 = new BrokenSpaceStation();
        addObject(brokenSpaceStation2,1047,114);
        brokenSpaceStation2.setLocation(373,745);
        brokenSpaceStation.setLocation(1100,76);
        brokenSpaceStation2.setLocation(379,737);
        removeObject(brokenSpaceStation2);
        brokenSpaceStation.setLocation(1054,175);
    }
}
