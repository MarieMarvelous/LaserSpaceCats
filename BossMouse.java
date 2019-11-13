import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossMouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossMouse extends Enemy {
    public BossMouse() {
    resizeImage(60, 60);
    damage = 5;
    health = 10;
    tempDamage = damage;
    }
        
    public int giveDamage() {
        return damage;
    }
    public void act() {
        
        
        randomMovement(25, 5, 20);
        super.act();
    }    
}
