import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TestWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestWorld extends CatWorld
{

    /**
     * Constructor for objects of class TestWorld.
     * 
     */
    public TestWorld()
    {
        killableEnemies = 1;
        killedEnemies = 0;
        
        addObject(new Ape(), 50, 50);
        addObject(new CatHero(), 100, 100);
    }
    public void act() {
        if(Greenfoot.isKeyDown("g")) {
            WorldController.switchToNextWorld(this);
        }
    }
}
