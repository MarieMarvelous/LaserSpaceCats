import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the parent World class. All other levels inherit from this one.
 */
public class CatWorld extends World {
    public static int killableEnemies;
    public static int killedEnemies = 0;

    public CatWorld() {
        super(800, 450, 1);
        Greenfoot.setSpeed(50);
        this.prepare();
    }

    public void act() {
        this.showText("Press \"Enter\" ", 400, 225);
        //only called once!

        if(Greenfoot.isKeyDown("enter")){
            //Greenfoot.delay(250);
            WorldController.switchToNextWorld(this);
        }

        //real act()
        //do Something everyone does \o/
    }

    private void prepare() {

    }

    public void checkForNextWorld(World world) {
        if (killedEnemies >= killableEnemies) {
            WorldController.switchToNextWorld(world);
        }
    }
    
    public static void registerKill() {
        killedEnemies++;
    }
    
    
    /*public void spawnedEnemy() {
        for (int i = 1; i <= killableEnemies; i++) {            
            addObject(new Mouse(), Greenfoot.getRandomNumber(750) + 25, 400);
        }
    }*/

}
