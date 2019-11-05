import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Squirrel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Squirrel extends Enemy {
    public int giveDamage() {
        return 5;
    }
    public void act() {
        randomMovement(5, 3, 8);
        super.act();
    }    
}
