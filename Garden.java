import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Garden here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Garden extends CatWorld {  
    private static boolean firstWaveReady = true;
    private static boolean secondWaveReady = true;
    private static boolean thirdWaveReady = true;
    private static boolean fourthWaveReady = true;
    private static boolean fithWaveReady = true;
    private static boolean sixthWaveReady = true;
    private static boolean seventhWaveReady = true;
    private static boolean eightWaveReady = true;
    private static boolean bossWaveReady = true;
    Bosshealthbar bosshealthbar = new Bosshealthbar();
    Dog dog = new Dog();

    public Garden() {
        super();
        //Sound
        SoundController.startSound("RaMxGF.mp3", true);
        //Leveldesign



        //Spawn Objects in World
        addObject(WorldController.getCatHero(), 885, 260);

        //addHealthbar
        Healthbar healthbar = new Healthbar();
        addObject(healthbar,296,68);
        prepare();
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
                spawnedEnemy(7, 806,351);
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
                spawnedEnemy(8, 806,351);
                seventhWaveReady = false;
            }
            if (killedEnemies >= 43 && eightWaveReady) {
                spawnedEnemy(10, 100,700);
                eightWaveReady = false;
            }

            if (killedEnemies >= 53 && bossWaveReady) {
                removeObject(dog);
                addObject(new BossDog(), 691, 571);
                addObject(bosshealthbar,800,100);
                bossWaveReady = false;
            }
       

    }

    public void spawnedEnemy(int n, int xMin, int yMin) {
        for (int i = 0; i < n; i++) {            
            addObject(new Squirrel(), Greenfoot.getRandomNumber(25)+xMin, Greenfoot.getRandomNumber(25)+yMin);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Rain(),1113,21);
        addObject(new Rain(),807,65);
        addObject(new Rain(),1402,308);
        addObject(new Rain(),1054,305);
        addObject(new Rain(),1536,167);
        addObject(new Rain(),1164,179);
        addObject(new Rain(),858,290);
        addObject(new Rain(),362,83);
        addObject(new Rain(),99,43);
        addObject(new Rain(),146,211);
        addObject(new Rain(),515,188);
        addObject(new Rain(),339,375);
        addObject(new Rain(),18,334);
        addObject(new Rain(),101,480);
        addObject(new Rain(),200,702);
        addObject(new Rain(),200,702);
        addObject(new Rain(),579,701);
        addObject(new Rain(),933,703);
        addObject(new Rain(),1425,699);
        addObject(new Rain(),1425,699);
        addObject(new Rain(),1395,388);
        addObject(new Rain(),1395,388);
        addObject(new Rain(),609,436);
        addObject(new Rain(),969,422);
        addObject(new Rain(),906,561);
        addObject(new Rain(),1212,503);
        addObject(new Rain(),651,581);
        addObject(new Rain(),816,162);
        addObject(new Rain(),405,272);
        addObject(new GardenUpperLeftCorner(),99,43);
        addObject(new GardenBarrel(),806,244);
        addObject(new GardenBarrel(),953,269);
        addObject(new GardenBarrel(),953,292);
        addObject(new GardenSmallestBush(),952,321);
        addObject(new GardenSmallestBush(),1187,645);
        addObject(new GardenSmallestBush(),249,718);
        addObject(new GardenSmallestBush(),601,593);
        addObject(new GardenSmallestBush(),455,544);
        addObject(new GardenSmallestBush(),218,643);
        addObject(new GardenSmallestBush(),512,345);
        addObject(new GardenSmallestBush(),601,170);
        addObject(new GardenSmallestBush(),572,96);
        addObject(new GardenSmallestBush(),543,146);
        addObject(new GardenSmallestBush(),44,94);
        addObject(new GardenSmallestBush(),44,445);
        addObject(new GardenSmallestBush(),13,494);
        addObject(new GardenSmallestBush(),43,619);
        addObject(new GardenSmallestBush(),15,743);
        addObject(new GardenSmallerBush(),27,136);
        addObject(new GardenSmallerBush(),88,411);
        addObject(new GardenSmallerBush(),0,385);
        addObject(new GardenSmallerBush(),0,708);
        addObject(new GardenSmallerBush(),261,585);
        addObject(new GardenSmallerBush(),264,659);
        addObject(new GardenSmallerBush(),674,634);
        addObject(new GardenSmallerBush(),499,385);
        addObject(new GardenSmallerBush(),524,111);
        addObject(new GardenSmallerBush(),1172,559);
        addObject(new GardenSign(),159,116);
        addObject(new GardenSign(),1361,439);
        addObject(new GardenSewer(),293,51);
        addObject(new GardenDoghouse(),197,415);
        addObject(new GardenBigBush(),395,83);
        addObject(new GardenBigBush(),571,357);
        addObject(new GardenBigBush(),513,581);
        addObject(new GardenBigBush(),72,357);
        addObject(new GardenBigBush(),1481,655);
        addObject(new GardenBaumStumpf(),1452,448);
        addObject(new GardenBaumkrone(),1511,515);
        addObject(new GardenHouseLowerRightCorner1(),1405,592);
        addObject(new GardenHouseLowerRightCornerBottom(),1395,679);
        addObject(new GardenStraw(),703,221);
        addObject(new GardenStraw(),938,247);
        addObject(new GardenBarrel(),952,267);
        addObject(new GardenBarrel(),953,294);
        addObject(new GardenSmallestBush(),953,321);
        addObject(new GardenStraw(),822,247);
        addObject(new GardenBarrel(),806,243);
        addObject(new GardenUpperRightCorner(),1097,72);
        addObject(new GardenUpperRightCornerLowerPart(),1110,179);
        addObject(new GardenUpperRightCornerLowerPart(),1108,178);
        addObject(new GardenHouseLowerRightCorner(),776,251);
        addObject(new GardenHouseLowerRightCorner(),747,252);
        addObject(new GardenUpperRightCornerLowestPart(),1288,322);
        addObject(new GardenBushKrone(),1216,510);
        addObject(new GardenMiddleLower(),559,29);
        addObject(new Rain(),1129,137);
        addObject(new Rain(),800,182);
        addObject(new Rain(),753,89);
        addObject(new Rain(),1126,310);
        addObject(new Rain(),1426,309);
        addObject(new Rain(),1417,156);
        addObject(new Rain(),1410,85);
        addObject(new Rain(),1301,594);
        addObject(new Rain(),1453,604);
        addObject(new Rain(),1428,469);
        addObject(new Rain(),562,372);
        addObject(new Rain(),90,407);
        addObject(new Rain(),134,80);
        addObject(new Rain(),432,68);
        addObject(new Rain(),849,174);
        addObject(new Rain(),808,86);
        addObject(new Rain(),490,734);
        addObject(new GardenBaumkrone(),1509,515);
        addObject(dog,191,403);
    }
}
