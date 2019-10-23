import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Laser extends Projectile {
    private static final int SPEED = 15;
    
    public Laser(int angle) {
        int adaptedAngle = angle;
        this.angle = adaptedAngle;
        setRotation(adaptedAngle); 
        GreenfootImage image = this.getImage();
        image.scale(40, 18);
        this.setImage(image);
    }

    
    public int getSpeed() {
        return SPEED;
    }      
    // Wenn der Laser auf ein Artefact trifft, soll der Laser despawnen
    public void despawnWeapon(){
        if(isTouching(Artefact.class)){
            getWorld().removeObjects(getIntersectingObjects(Laser.class));
            getWorld().removeObject(this);
            }
       }
    
    public void act() {
        super.act();
        
    }    
}
