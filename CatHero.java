import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CatHero extends Hero {
    public static final int SPEED=5;
    public CatHero() {
        super(100000000);
    }
    
    public void act() {
        super.act();
        super.movement("a", "d", "w", "s", SPEED);
        //super.checkCollision();
        
    }    
}
