import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossMouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossMouse extends Enemy {
    public BossMouse() {
        super(15);
        resizeImage(60, 60);
        damage = 5;
        tempDamage = damage;
    }

    public int giveDamage() {
        return damage;
    }

    public void act() {
        randomMovement(2, 15, 15);
        updateBosshealthbar();
        getWorld().setPaintOrder(Bosshealthbar.class);
        super.act();
    }    
}
