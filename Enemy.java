import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public abstract class Enemy extends Entity {
    public abstract int giveDamage();
    public void act (){
        super.act();
        checkForLaserCollision();
    }    
    public void checkForLaserCollision() {
        if (isTouching(Laser.class)) {
            getWorld().removeObjects(getIntersectingObjects(Laser.class));
            getWorld().removeObject(this);
        }
    }
}
