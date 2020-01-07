import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Loot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Loot extends Actor
{
    /**
     * Act - do whatever the Loot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Loot() {
        
    }
    
    public abstract void onCollect();
    
    public void act() 
    {
        if (isTouching(CatHero.class)) {
            //nextWorldReady = true;
            WorldController.switchToNextWorld(getWorld());
            onCollect();
        }
    }
    
    public void increaseLife(int amount) {
        WorldController.increaseHeroLife(amount);
    }
}
