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

        //init
        firstWaveReady = true;
        secondWaveReady = true;
        thirdWaveReady = true;
        fourthWaveReady = true;
        fithWaveReady = true;
        sixthWaveReady = true;
        seventhWaveReady = true;
        eightWaveReady = true;
        bossWaveReady = true;

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
        addObject(new Blocking(197, 88), 99, 43);
        addObject(new Blocking(29, 44), 806, 244);
        addObject(new Blocking(29, 44), 953, 269);
        addObject(new Blocking(29, 44), 953, 292);
        addObject(new Blocking(28, 41), 952,321);
        addObject(new Blocking(28, 41),1187,645);
        addObject(new Blocking(28, 41),249,718);
        addObject(new Blocking(28, 41),601,593);
        addObject(new Blocking(28, 41),455,544);
        addObject(new Blocking(28, 41),218,643);
        addObject(new Blocking(28, 41),512,345);
        addObject(new Blocking(28, 41),601,170);
        addObject(new Blocking(28, 41),572,96);
        addObject(new Blocking(28, 41),543,146);
        addObject(new Blocking(28, 41),44,94);
        addObject(new Blocking(28, 41),44,445);
        addObject(new Blocking(28, 41),13,494);
        addObject(new Blocking(28, 41),43,619);
        addObject(new Blocking(28, 41),15,743);
        addObject(new Blocking(28, 41), 368, 21);
        addObject(new Blocking(28, 41), 1393, 694);
        addObject(new Blocking(52, 51),27,136);
        addObject(new Blocking(52, 51),88,411);
        addObject(new Blocking(52, 51),0,385);
        addObject(new Blocking(52, 51),0,708);
        addObject(new Blocking(52, 51),261,585);
        addObject(new Blocking(52, 51),264,659);
        addObject(new Blocking(52, 51),674,634);
        addObject(new Blocking(52, 51),499,385);
        addObject(new Blocking(52, 51),524,111);
        addObject(new Blocking(52, 51),1172,559);
        addObject(new Blocking(29, 45),159,116);
        addObject(new Blocking(29, 45),1361,439);
        addObject(new Blocking(54, 53),293,51);
        addObject(new Blocking(99, 133),197,415);
        addObject(new Blocking(79, 61),395,83);
        addObject(new Blocking(79, 61),571,357);
        addObject(new Blocking(79, 61),513,581);
        addObject(new Blocking(79, 61),72,357);
        addObject(new Blocking(79, 61),1481,655);
        addObject(new Blocking(30, 38),1452,448);
        addObject(new Blocking(59, 19),1511,515);
        addObject(new Blocking(397, 142),1402,592);
        addObject(new Blocking(78, 33),1395,679);
        addObject(new Blocking(60, 36),703,221);
        addObject(new Blocking(60, 36),938,247);
        addObject(new Blocking(60, 36),822,247);
        addObject(new Blocking(60, 36),763,247);
        addObject(new Blocking(60, 36),498,0);
        addObject(new Blocking(29, 44),952,267);
        addObject(new Blocking(29, 44),953,294);
        addObject(new Blocking(29, 44),806,243);
        addObject(new Blocking(1010, 136),1097,72);
        addObject(new Blocking(983, 81),1110,179);
        addObject(new Blocking(622, 173),1288,322);
        addObject(new Blocking(84, 29),1216,510);
        addObject(new Blocking(60, 25),559,29);
        addObject(new Blocking(30, 60),12,607);
        addObject(new Blocking(367, 29),1421, 781);
        addObject(dog,180,403);

        //Rain
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
    }
}
