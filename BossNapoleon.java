import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossNapoleon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossNapoleon extends Enemy {
    public int giveDamage() {
        return 15;
    }
    public void act() 
    {
        // movement(5, 3, 8);
        randomMovement(12, 2, 6);
        super.act();
    }    
}
