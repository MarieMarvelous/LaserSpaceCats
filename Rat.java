import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rat extends Enemy {
    public Rat() {
        resizeImage(30, 30);
    }
    
    public int giveDamage() {
        return 5;
    }

    public void act() {
       // movement(5, 3, 8);
        randomMovement(5, 3, 8);
        super.act();
    }    
}
