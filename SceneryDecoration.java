import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SceneryDecoration here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SceneryDecoration extends Entity
{
    public void resizeImage(int width, int height) {
        GreenfootImage image =getImage();
        image.scale(width, height);
        setImage(image);
    } 
    /**
     * Act - do whatever the SceneryDecoration wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
