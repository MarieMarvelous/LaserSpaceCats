import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Loot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Loot extends Actor
{
    /**
     * Act - do whatever the Loot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //boolean nextWorldReady = false;
    public Loot() {
        
    }
    public void act() 
    {
        if (isTouching(CatHero.class)) {
            //nextWorldReady = true;
            WorldController.switchToNextWorld(getWorld());
        }
    }    
}
