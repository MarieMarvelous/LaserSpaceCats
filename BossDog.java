import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossDog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossDog extends Enemy {
    public int giveDamage() {
        return 5;
    }
    
    public BossDog() {
    }
    
    public void act() {
        randomMovement(10, 4, 10);
        super.act();
    }    
}
