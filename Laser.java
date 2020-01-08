
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Laser extends Projectile {
    private static final int SPEED = 15;
    public static final int DAMAGE = 2;
    private static final int TIME_TO_LIVE = 35;
    
    public Laser(int angle) {
        int adaptedAngle = angle;
        this.angle = adaptedAngle;
        setRotation(adaptedAngle); 
        GreenfootImage image = this.getImage();
        image.scale(40, 18);
        this.setImage(image);
        this.timeToLive = TIME_TO_LIVE;
    }

    
    public int getSpeed() {
        return SPEED;
    }
    
    public void act() {
        super.act();
        if (timeToLive > 0) {
            timeToLive--;
        } else {
            try {
                getWorld().removeObject(this);
            } catch (Exception ignored) {
                //already removed
            }
        }
    }    
}
