import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Laser extends Projectile {
    public Laser() {
        GreenfootImage image = getImage();
        image.scale(11, 6);
        setImage(image);
    }
    
    private static final int SPEED = 15;
    
    public Laser(int angle) {
        int adaptedAngle = angle;
        this.angle = adaptedAngle;
        setRotation(adaptedAngle);
    }

    public int getSpeed() {
        return SPEED;
    }      
  
    public void act() {
        super.act();
    }    
}
