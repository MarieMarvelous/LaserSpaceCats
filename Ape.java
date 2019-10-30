import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ape extends Enemy {
    
    public Ape() {
        damage = 5;
        tempDamage = damage;
    }

    public int giveDamage() {
        return damage;
    }
    
    public void act() {
        runTowardsCatHero();
        super.act();
        //shootBanana();
        //shootCatHero();
        //shootBanana();
        //super.canSee();
        
        
    }   
}
