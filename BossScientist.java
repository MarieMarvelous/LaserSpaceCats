import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossScientist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossScientist extends Enemy {
    
    public BossScientist() {
        damage = 10;
        tempDamage = damage;
    }
    public int giveDamage() {
        return damage;
    }
    public void act() 
    {
        // movement(5, 3, 8);
        randomMovement(5, 3, 8);
        super.act();
    }    
}
