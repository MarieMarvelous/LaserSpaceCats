import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossSlime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossSlime extends Enemy {
    public BossSlime() {
        damage = 5;
        health = 12;
        tempDamage = damage;
    }
    public int giveDamage() {
        return damage;
    }
    public void act() 
    {
        // movement(5, 3, 8);
        randomMovement(15, 13, 8);
        super.act();
    }    
}
