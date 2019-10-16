import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DamageIndicator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DamageIndicator extends Actor
{
    /**
     * Act - do whatever the DamageIndicator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int frameCounter = 0;
    int drawback;
    int drawbackFrames;
    GreenfootImage gi;

    public void act() 
    {
        if (frameCounter == 0) {
            getWorld().removeObject(this);
        }
        countFrames();
    }   
    
    public DamageIndicator(String text) {
        gi = new GreenfootImage(text, 24, Color.RED, Color.WHITE);
        setImage(gi);
        startFrameCounting(30);
    }
    
    public void startFrameCounting(int amount) {
        frameCounter = amount;
    }

    public void countFrames() {
        if (frameCounter > 0) {
            frameCounter--;
        }
    }
}
