import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Entity extends Actor implements Lootable {

    public void act() {

    }  
    
    
  
    public void move(int amount) {
        double angle = Math.toRadians(getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle) * amount);
        int y = (int) Math.round(getY() + Math.sin(angle) * amount);
        
        setLocation(x, y);
    }
    
    public void turn(int angle) {
        setRotation(getRotation() + angle);
    }

}
