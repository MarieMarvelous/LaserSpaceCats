    
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
    GreenfootSound backgroundMusic = new GreenfootSound("RaMxGF.mp3");
    public GuianaSpaceCenter() {
        super();
        //Sound
        backgroundMusic.playLoop();
        addObject(new CatHero(), 1388, 780);

   
        //Leveldesign startet hier
        addObject(new SpaceCenterBed(), 878, 264);
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
        addObject(new SpaceCenterTrashcan2(), 74, 579);

        //addHealthbar
        Healthbar healthbar = new Healthbar();
        addObject(healthbar,296,68);

        prepare();
    }

    public void act() {
        if (firstWaveReady) {
                spawnedEnemy(4, 20, 200);
                this.showText("Welle 1", 700, 25);
                firstWaveReady = false;
            }
            if (killedEnemies >= 4 && secondWaveReady) {
                spawnedEnemy(3, 20, 200);
                this.showText("Welle 2", 700, 25);
                secondWaveReady = false;
            }
            if (killedEnemies >= 7 && thirdWaveReady) {
                spawnedEnemy(5, 90,500);
                this.showText("Welle 3", 700, 25);
                thirdWaveReady = false;
            }

            if (killedEnemies >= 12 && fourthWaveReady) {
                spawnedEnemy(7, 800,200);
                this.showText("Welle 4", 700, 25);
                fourthWaveReady = false;
            }

            if (killedEnemies >= 19 && fithWaveReady) {
                spawnedEnemy(8, 1000,700);
                this.showText("Welle 5", 700, 25);
                fithWaveReady = false;
            }
            if (killedEnemies >= 27 && sixthWaveReady) {
                spawnedEnemy(8, 30,600);
                this.showText("Welle 6", 700, 25);
                sixthWaveReady = false;
            }
            if (killedEnemies >= 35 && seventhWaveReady) {
                spawnedEnemy(8, 800,200);
                this.showText("Welle 7", 700, 25);
                seventhWaveReady = false;
            }
            if (killedEnemies >= 43 && eigthWaveReady) {
                spawnedEnemy(10, 100,700);
                this.showText("Welle 8", 700, 25);
                eigthWaveReady = false;
            }

            if (killedEnemies >= 53 && bossWaveReady) {
                addObject(new BossScientist(), 691, 571);
                this.showText("!!! ACHTUNG BOSS WELLE !!!", 700, 25);
                bossWaveReady = false;
            }
    }
    
    
    public void spawnedEnemy(int n, int xMin, int yMin) {
        for (int i = 0; i < n; i++) {            
            addObject(new Ape(), Greenfoot.getRandomNumber(100)+xMin, Greenfoot.getRandomNumber(50)+yMin);
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