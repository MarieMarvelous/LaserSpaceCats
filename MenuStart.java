import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuStart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuStart extends HUD
{
    /**
     * Act - do whatever the MenuStart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
            {
             Greenfoot.setWorld(new StoryScreen());
             
            }
        
    }    
}
