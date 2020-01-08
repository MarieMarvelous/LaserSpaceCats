import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Squirrel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Squirrel extends Enemy {
    
    public Squirrel() {
        super(4);
        damage = 5;
        tempDamage = damage;
    }
    public int giveDamage() {
        return damage;
    }
    public void act() {
        randomMovement(2, 40, 10);
        super.act();
    }    
}
