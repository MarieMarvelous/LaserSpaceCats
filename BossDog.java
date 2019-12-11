import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossDog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossDog extends Enemy {
    public int maximalHealth;
    public int health;
    public int giveDamage() {
        return 5;
    }
    
    public BossDog() {
        super(50);
    }
    
    public void act() {
        randomMovement(9, 4, 10);
        updateBosshealthbar();
        getWorld().setPaintOrder(Bosshealthbar.class);
        super.act();
        
    }

}
