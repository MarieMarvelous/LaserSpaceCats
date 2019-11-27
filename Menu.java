import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends CatWorld
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {
        super();
    }
    public void act()
    {
        
        if(Greenfoot.isKeyDown("enter")){
            WorldController.switchToNextWorld(this);
        }  
        
    }
}