import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rat extends Enemy {
    public Rat() {
        resizeImage(30, 30);
        damage = 5;
        tempDamage = damage;
    }
    
    public int giveDamage() {
        return damage;
    }

    public void act() {
        movement(5, 3, 8);
        super.act();
    }    
}
