import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ape extends Enemy {
    
    public Ape() {
        super(5);
        damage = 5;
        tempDamage = damage;
    }

    public int giveDamage() {
        return damage;
    }
    
    public void act() {
        // movement(5, 3, 8);
        randomMovement(7, 5, 8);
        super.act();
        //shootBanana();
        //shootCatHero();
        //shootBanana();
        //super.canSee();
        
        
    }   
}
