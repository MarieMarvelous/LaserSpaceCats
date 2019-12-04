    
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
        
        
        //addHealthbar
        Healthbar healthbar = new Healthbar();
        addObject(healthbar,296,68);
        
        addObject(new Spacehelm(), 400, 700);
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
    
}