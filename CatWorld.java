import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the parent World class. All other levels inherit from this one.
 */
public class CatWorld extends World {

    public CatWorld() {
        super(1600, 900, 1);
        Greenfoot.setSpeed(50);
    }

    private void prepare() {
        createWorld();
    }

    public void createWorld() {
        Greenfoot.setWorld(new Garden());
    }
}
