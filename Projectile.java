import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Projectile extends Entity {
    public abstract int getSpeed();
    public int angle;

    public void act() {
        move(getSpeed());
        if(isAtEdge()) {
            getWorld().removeObject(this);
        }
    }   
}

