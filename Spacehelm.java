import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spacehelm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spacehelm extends Loot
{
    public void act() {
        super.act();
    }
    
    public void onCollect() {
        increaseLife(25);
    }
}
