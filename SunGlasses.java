import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlatzhalterItem1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SunGlasses extends Loot
{
    public void act() {
        super.act();
    }  
    
    public void onCollect() {
        increaseDamageMultiplier(1.5);
    }
}
