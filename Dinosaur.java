import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dinosaur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dinosaur extends Enemy {
    public Dinosaur() {
        damage = 5;
        health = 6;
        tempDamage = damage;
    }
    public int giveDamage() {
        return damage;
    }
    public void act() 
    {
       // movement(5, 3, 8);
        randomMovement(8, 5, 8);
        super.act();
    }    
}
