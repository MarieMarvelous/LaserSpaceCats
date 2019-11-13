import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tunnelVision here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tunnelVision extends HUD
{
    /**
     * Act - do whatever the tunnelVision wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        updateTunnelVision();
    }    
    
    public void updateTunnelVision(){
        Actor CatHero = (Actor)getWorld().getObjects(CatHero.class).get(0);
        setLocation(CatHero.getX(), CatHero.getY());    
    }
}
