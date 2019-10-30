import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ape extends Enemy {

    
    public int giveDamage() {
        return 5;
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
