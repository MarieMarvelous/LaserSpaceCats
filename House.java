import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class House here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class House extends CatWorld {
    private static int counter = 0;

    public House() {
        super();
        addObject(new CatHero(), 200, 200);
        
        addObject(new Rat(), 500, 500);
    }
    
    public void act() {
        counter++;
        if (counter > 250) {
            WorldController.switchToNextWorld(this);
        }
    }
}
