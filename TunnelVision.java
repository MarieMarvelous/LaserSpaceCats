import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TunnelVision here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TunnelVision extends HUD
{
    /**
     * Act - do whatever the TunnelVision wants to do. This method is called whenever
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
