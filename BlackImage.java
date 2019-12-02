import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlackImage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackImage extends HUD
{
    /**
     * Act - do whatever the BlackImage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void setTransparency(int newTransparency) {
        getImage().setTransparency(newTransparency);
    }
    
    public int getTransparency() {
        return getImage().getTransparency();
    }
}
