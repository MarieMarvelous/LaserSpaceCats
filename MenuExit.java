import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuExit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuExit extends HUD
{
    /**
     * Act - do whatever the MenuExit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            System.exit(0);
        }
    }    
}
