import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StoryScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StoryScreen extends CatWorld {
    ScrollingStartScreen startStory = new ScrollingStartScreen();
    BlackImage fading = new BlackImage();
    GreenfootSound thunderStorm = new GreenfootSound("thunderstrike.mp3");

    public StoryScreen() {
        thunderStorm.playLoop();
        addObject(startStory, 800, 1600);
        fading.setTransparency(0);
        addObject(fading, 800, 400);
    }

    public void act() {
        if(startStory.getY() != 0) {
            startStory.setLocation(startStory.getX(), startStory.getY()-1);
        } else if (fading.getTransparency() < 255) { 
            fading.setTransparency(fading.getTransparency() +1) ;
        } else {
            WorldController.switchToNextWorld(this);
        }
    }
}