import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends CatWorld
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {
        MenuExit menuExit = new MenuExit();
        addObject(menuExit,1200,612);
        MenuStart menuStart = new MenuStart();
        addObject(menuStart,1200,356);
        setPaintOrder(MenuStart.class, MenuExit.class);
    }

}
