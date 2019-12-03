import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rain extends Actor {
    GifImage rain = new GifImage("rain2.gif");
    
    public void act() {
        setImage(rain.getCurrentImage() );
    }    
}
