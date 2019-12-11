import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sewers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sewers extends CatWorld {
    private static boolean secondWaveReady = true;
    private static boolean thirdWaveReady = true;
    private static boolean fourthWaveReady = true;
    private static boolean fithWaveReady = true;
    private static boolean bossWaveReady = true; 
    GreenfootSound backgroundMusic = new GreenfootSound("RaMxGF.mp3");
    public Sewers() {
        super();
        //Sound
        backgroundMusic.playLoop();
        killableEnemies = 3;
        addObject(new CatHero(), 50, 50);
        spawnedEnemy(1);
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
        
        
    }

    public void act() {
        if (killedEnemies >= 1 && secondWaveReady) {
            spawnEnemy(EnemyType.RAT, 2);
            this.showText("Welle 2", 700, 25);
            secondWaveReady = false;
        }
        if (killedEnemies >= 3 && thirdWaveReady) {
            spawnEnemy(EnemyType.RAT, 3);
            this.showText("Welle 3", 700, 25);
            thirdWaveReady = false;
        }

        if (killedEnemies >= 6 && fourthWaveReady) {
            spawnEnemy(EnemyType.RAT, 5);
            this.showText("Welle 4", 700, 25);
            fourthWaveReady = false;
        }

        if (killedEnemies >= 11 && fithWaveReady) {
            spawnEnemy(EnemyType.RAT, 8);
            this.showText("Welle 5", 700, 25);
            fithWaveReady = false;
        }

        if (killedEnemies >= 19  && bossWaveReady) {
            spawnEnemy(EnemyType.BOSSSLIME, 1);
            this.showText("!!! ACHTUNG BOSS WELLE !!!", 700, 25);
            bossWaveReady = false;
        }
    }

    public void spawnedEnemy(int n) {
        for (int i = 0; i <= 2; i++) {            
            addObject(new Rat(), Greenfoot.getRandomNumber(750) + 25, 400);
        }
    }

   
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
    }
}
