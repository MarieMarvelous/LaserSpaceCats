    
    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
/**
 * Write a description of class GuianaSpaceCenter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class GuianaSpaceCenter extends CatWorld {
    private static boolean secondWaveReady = true;
    private static boolean thirdWaveReady = true;

    public GuianaSpaceCenter() {
        super();
        addObject(new CatHero(), 1388, 780);
        killableEnemies = 2;
        spawnedEnemy();   
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

        addObject(new Spacehelm(), 400, 700);
        prepare();
    }

    public void act() {
        if (killedEnemies >= 2 && secondWaveReady) {
            spawnEnemy(EnemyType.APE, 2);
            secondWaveReady = false;
        }
        if (killedEnemies >= 4 && thirdWaveReady) {
            spawnEnemy(EnemyType.APE, 2);
            thirdWaveReady = false;
        }//Beide if-methoden
        checkForNextWorld(this);
    }

    public void spawnedEnemy() {
        for (int i = 1; i <= killableEnemies; i++) {            
            addObject(new Mouse(), Greenfoot.getRandomNumber(750) + 25, 400);
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