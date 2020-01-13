import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana extends Projectile {
    private static final int SPEED = 5;
    
    public Banana(int angle) {
        int adaptedAngle = angle;
        this.angle = adaptedAngle;
        setRotation(adaptedAngle); 
        GreenfootImage image = this.getImage();
        image.scale(15, 15);
        this.setImage(image);
        
        damage = 1;
    }

    public int getSpeed() {
        return SPEED;
    }      
  
    public void act() {
        super.act();
        turn(5);
    }     
}  

