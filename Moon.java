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
    GreenfootSound backgroundMusic = new GreenfootSound("RaMxGF.mp3");
    
    public Moon(CatHero hero) {
    super();
        //Sound
        backgroundMusic.playLoop();
        addObject(hero, 800, 500);

        //addHealthbar
        Healthbar healthbar = new Healthbar();
        addObject(healthbar,296,68);
    }
    
    public void act() {
        
        if (firstWaveReady) {
                spawnedEnemy(4, 20, 200);
                this.showText("Welle 1", 800, 25);
                firstWaveReady = false;
            }
            if (killedEnemies >= 4 && secondWaveReady) {
                spawnedEnemy(3, 20, 200);
                this.showText("Welle 2", 800, 25);
                secondWaveReady = false;
            }
            if (killedEnemies >= 7 && thirdWaveReady) {
                spawnedEnemy(5, 90,500);
                this.showText("Welle 3", 800, 25);
                thirdWaveReady = false;
            }

            if (killedEnemies >= 12 && fourthWaveReady) {
                spawnedEnemy(7, 800,200);
                this.showText("Welle 4", 800, 25);
                fourthWaveReady = false;
            }

            if (killedEnemies >= 19 && fithWaveReady) {
                spawnedEnemy(8, 1000,700);
                this.showText("Welle 5", 800, 25);
                fithWaveReady = false;
            }
            if (killedEnemies >= 27 && sixthWaveReady) {
                spawnedEnemy(8, 30,600);
                this.showText("Welle 6", 800, 25);
                sixthWaveReady = false;
            }
            if (killedEnemies >= 35 && seventhWaveReady) {
                spawnedEnemy(8, 800,200);
                this.showText("Welle 7", 800, 25);
                seventhWaveReady = false;
            }
            if (killedEnemies >= 43 && eigthWaveReady) {
                spawnedEnemy(10, 100,700);
                this.showText("Welle 8", 800, 25);
                eigthWaveReady = false;
            }

            if (killedEnemies >= 53 && bossWaveReady) {
                addObject(new BossNapoleon(), 691, 571);
                this.showText("!!! ACHTUNG BOSS WELLE !!!", 800, 100);
                bossWaveReady = false;
            }

    }
    public void spawnedEnemy(int n, int xMin, int yMin) {
        for (int i = 0; i < n; i++) {            
            addObject(new Dinosaur(), Greenfoot.getRandomNumber(100)+xMin, Greenfoot.getRandomNumber(50)+yMin);
        }
    }

}
