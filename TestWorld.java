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
        addObject(new BossNapoleon(), 500, 500);
        
        addObject(new CatHero(), 100, 100);
        //addHealthbar
        Healthbar healthbar = new Healthbar();
        addObject(healthbar,296,68);
        
        //TunnelVision
        tunnelVision tunnelVision = new tunnelVision();
        addObject(tunnelVision,1141,364);
       
    }
    public void act() {
        if(Greenfoot.isKeyDown("g")) {
            WorldController.switchToNextWorld(this);
        }
    }
}
