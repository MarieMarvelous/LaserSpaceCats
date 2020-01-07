import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rat extends Enemy {
    public Rat() {
        super(5);
        resizeImage(30, 30);
        damage = 3;
        tempDamage = damage;
    }
    
    public int giveDamage() {
        return damage;
    }

    public void act() {
        randomMovement(5, 3, 8);
        super.act();
    }    
}
