import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlatzhalterItem2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TinArmor extends Loot
{
    public void act() {
        super.act();
    }
    
    public void onCollect() {
        increaseLife(25);
    }
}
