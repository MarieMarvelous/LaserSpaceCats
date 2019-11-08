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
    private static boolean bossWaveReady = true;

    public Garden() {
        super();
        //Leveldesign
        addObject(new StonePattern(), 777, 426);
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
        addObject(new Mushrooms(), 200, 131);

        //Spawn Objects in World
        addObject(new CatHero(),400,225);
        spawnEnemy(EnemyType.SQUIRREL, 2);
        killableEnemies = 7;

        //addHealthbar
        Healthbar healthbar = new Healthbar();
        addObject(healthbar,296,68);
    }

    public void act() {
        if (killedEnemies >= 2 && secondWaveReady) {
            spawnEnemy(EnemyType.SQUIRREL, 2);
            secondWaveReady = false;
        }
        if (killedEnemies >= 4 && thirdWaveReady) {
            spawnEnemy(EnemyType.SQUIRREL, 2);
            thirdWaveReady = false;
        }//Beide if-methoden
        if (killedEnemies >= 6 && bossWaveReady) {
            spawnEnemy(EnemyType.BOSSDOG, 1);
            bossWaveReady = false;
        }

        checkForNextWorld(this);
    }

    public void spawnedEnemy() {
        for (int i = 1; i <= killableEnemies; i++) {            
            addObject(new Rat(), Greenfoot.getRandomNumber(750) + 25, 400);
        }
    }

}
