import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Entity extends Actor {
    int tempDamage;
    int framesToCount;
    public int damage;

    public void act() {

    }  
    
    public void resizeImage(int width, int height) {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    } 

    /**
     * Move an Entity into the direction it is currently facing
     * 
     * @param amount 
     *          The amount the entity is getting moved into the current direction.
     */
    public void move(int amount) {
        double angle = Math.toRadians(getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle) * amount);
        int y = (int) Math.round(getY() + Math.sin(angle) * amount);
        setLocation(x, y);
    }

    /**
     * Turns the Entity with a given angle.
     */
    public void turn(int angle) {
        setRotation(getRotation() + angle);
    }

    public void countFrames() {
        if (framesToCount != 0) {
            framesToCount--;
        }
    }

    public void startFrameCounting(int amount) {
        framesToCount = amount;
    }

}
