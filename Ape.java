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
        runTowardsCatHero();
        //shootBanana();
        //shootCatHero();
        //shootBanana();
        //super.canSee();
        
        
    }   
}
