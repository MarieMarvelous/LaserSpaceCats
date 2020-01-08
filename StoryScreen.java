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
    boolean isSecondFrame = false; //Allow for scrolling with only half the speed.
    boolean isSkipped = false;

    public StoryScreen() {
        SoundController.startSound(SoundType.THUNDERSTORM, true);
        addObject(startStory, 800, 1600);
        fading.setTransparency(0);
        addObject(fading, 800, 400);
    }

    public void act() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (Greenfoot.isKeyDown("enter") || (mouse != null && mouse.getButton() == 1)) {
            SoundController.stopSound(SoundType.THUNDERSTORM);
            WorldController.switchToNextWorld(this);
        }
        
        if(startStory.getY() != 0) {
            if (isSecondFrame) {
                startStory.setLocation(startStory.getX(), startStory.getY()-1);
                isSecondFrame = false;
            } else {
                isSecondFrame = true;
            }
        } else if (fading.getTransparency() < 255) { 
            fading.setTransparency(fading.getTransparency() +1) ;
        } else {
            SoundController.stopSound(SoundType.THUNDERSTORM);
            WorldController.switchToNextWorld(this);  
        }
    }
}