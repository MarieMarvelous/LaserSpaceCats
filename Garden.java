import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Garden here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Garden extends CatWorld {  
    private static boolean secondWaveReady = true;
    private static boolean thirdWaveReady = true;
    private static boolean fourthWaveReady = true;
    private static boolean fithWaveReady = true;
    private static boolean bossWaveReady = true;
    GreenfootSound backgroundMusic = new GreenfootSound("RaMxGF.mp3");

    public Garden() {
        super();
        //Sound
        backgroundMusic.playLoop();
        //Leveldesign
        /*addObject(new StonePattern(), 777, 426);
        addObject(new StonePattern(), 777, 376);
        addObject(new StonePattern(), 727, 376);
        addObject(new StonePattern(), 727, 426);
        addObject(new StonePattern(), 777, 326);
        addObject(new StonePattern(), 777, 276);
        addObject(new StonePattern(), 727, 276);
        addObject(new StonePattern(), 727, 326);
        addObject(new StonePattern(), 777, 226);
        addObject(new StonePattern(), 777, 176);
        addObject(new StonePattern(), 727, 176);
        addObject(new StonePattern(), 727, 226);
        addObject(new StonePattern(), 777, 126);
        addObject(new StonePattern(), 777, 76);
        addObject(new StonePattern(), 727, 76);
        addObject(new StonePattern(), 727, 126);
        addObject(new StonePattern(), 777, 26);
        addObject(new StonePattern(), 777, 0);
        addObject(new StonePattern(), 727, 0);
        addObject(new StonePattern(), 727, 26);

        addObject(new Flowers(), 664, 430);
        addObject(new Flowers(), 65, 365);

        addObject(new Fence1(), 700, 40);
        addObject(new Fence1(), 700, 110);
        addObject(new Fence1(), 700, 180);
        addObject(new Fence1(), 700, 250);
        addObject(new Fence1(), 700, 320);
        addObject(new Fence1(), 700, 390);
        addObject(new Fence1(), 700, 460);

        addObject(new Mushrooms(), 236, 100);
        addObject(new Mushrooms(), 120, 140);
        addObject(new TreeGroup(), 155, 65);
        addObject(new Mushrooms(), 200, 131);*/

        addObject(new TinArmor(), 300, 800);

        //Spawn Objects in World
        addObject(new CatHero(),895,245);
        spawnEnemy(EnemyType.SQUIRREL, 1);

        //addHealthbar
        Healthbar healthbar = new Healthbar();
        addObject(healthbar,296,68);
        prepare();
    }

    public void act() {
        if (killedEnemies >= 1 && secondWaveReady) {
            spawnEnemy(EnemyType.SQUIRREL, 2);
            secondWaveReady = false;
        }
        if (killedEnemies >= 3 && thirdWaveReady) {
            spawnEnemy(EnemyType.SQUIRREL, 3);
            thirdWaveReady = false;
        }
        if (killedEnemies >= 6 && fourthWaveReady) {
            spawnEnemy(EnemyType.SQUIRREL, 5);
            fourthWaveReady = false;
        }
        if (killedEnemies >= 11 && fithWaveReady) {
            spawnEnemy(EnemyType.SQUIRREL, 8);
            fithWaveReady = false;
        }
        if (killedEnemies >= 19 && bossWaveReady) {
            spawnEnemy(EnemyType.BOSSDOG, 1);
            bossWaveReady = false;
        }
    }

    public void spawnedEnemy() {
        for (int i = 1; i <= killableEnemies; i++) {            
            addObject(new Rat(), Greenfoot.getRandomNumber(750) + 25, 400);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rain rain = new Rain();
        addObject(rain,1113,21);
        Rain rain2 = new Rain();
        addObject(rain2,807,65);
        Rain rain3 = new Rain();
        addObject(rain3,1402,308);
        Rain rain4 = new Rain();
        addObject(rain4,1054,305);
        Rain rain5 = new Rain();
        addObject(rain5,1536,167);
        Rain rain6 = new Rain();
        addObject(rain6,1164,179);
        Rain rain7 = new Rain();
        addObject(rain7,858,290);
        Rain rain8 = new Rain();
        addObject(rain8,362,83);
        Rain rain9 = new Rain();
        addObject(rain9,36,53);
        Rain rain10 = new Rain();
        addObject(rain10,146,211);
        Rain rain11 = new Rain();
        addObject(rain11,515,188);
        Rain rain12 = new Rain();
        addObject(rain12,339,375);
        Rain rain13 = new Rain();
        addObject(rain13,18,334);
        Rain rain14 = new Rain();
        addObject(rain14,101,480);
        Rain rain15 = new Rain();
        addObject(rain15,123,632);
        rain15.setLocation(200,702);
        Rain rain16 = new Rain();
        addObject(rain16,200,702);
        Rain rain17 = new Rain();
        addObject(rain17,579,701);
        Rain rain18 = new Rain();
        addObject(rain18,933,703);
        Rain rain19 = new Rain();
        addObject(rain19,1298,701);
        rain19.setLocation(1425,699);
        Rain rain20 = new Rain();
        addObject(rain20,1425,699);
        Rain rain21 = new Rain();
        addObject(rain21,1408,527);
        rain3.setLocation(1395,388);
        Rain rain22 = new Rain();
        addObject(rain22,1395,388);
        Rain rain23 = new Rain();
        addObject(rain23,609,436);
        Rain rain24 = new Rain();
        addObject(rain24,969,422);
        Rain rain25 = new Rain();
        addObject(rain25,906,561);
        Rain rain26 = new Rain();
        addObject(rain26,1212,503);
        Rain rain27 = new Rain();
        addObject(rain27,651,581);
        Rain rain28 = new Rain();
        addObject(rain28,816,162);
        rain11.setLocation(405,272);
        Rain rain29 = new Rain();
        addObject(rain29,405,272);
    }
}
