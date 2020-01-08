import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ape extends Enemy {
    
    public Ape() {
        super(6);
        damage = 5;
        tempDamage = damage;
    }

    public int giveDamage() {
        return damage;
    }
    
    public void act() {
        randomMovement(3, 30, 8);
        super.act();
    }   
}
