import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the parent World class. All other levels inherit from this one.
 */
public class CatWorld extends World {
    private static boolean alreadyInitialized = false;

    public CatWorld() {
        super(1600, 900, 1);
        Greenfoot.setSpeed(50);
        prepare();
    }

    public void act() {
        //only called once!
        if (!alreadyInitialized) {
            Greenfoot.delay(250);
            WorldController.switchToNextWorld(this);
            alreadyInitialized = true;
        }

        //real act()
        //do Something everyone does \o/
    }

    private void prepare() {

    }

}
