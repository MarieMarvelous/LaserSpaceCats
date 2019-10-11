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
    public Laser(Direction dir) {
        this.dir = dir;
        switch(dir) {
            case NORTH:
                this.angle = 90;
                setRotation(90);
                break;
            case EAST:
                this.angle = 180;
                setRotation(180);
                break;
            case SOUTH:
                this.angle = 270;
                setRotation(270);
                break;
            case WEST:
                this.angle = 0;
                break;
            default:
                break;
        }
    }
    public int getSpeed() {
        return SPEED;
    }      
  
    public void act() {
        super.act();
    }    
}
