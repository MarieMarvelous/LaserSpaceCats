import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Glasses here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Glasses extends Loot {
    public void onCollect() {
        increaseDamageMultiplier(0.5);
    }
    
    public void act() {
        super.act();
    }
}
