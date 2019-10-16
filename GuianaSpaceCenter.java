import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GuianaSpaceCenter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class GuianaSpaceCenter extends CatWorld {

    public GuianaSpaceCenter() {
        super();
        addObject(new CatHero(), 50, 50);
        killableEnemies = 2;
        spawnedEnemy();        
    }
    
    public void act() {
        checkForNextWorld(this);
    }
    
    public void spawnedEnemy() {
        for (int i = 1; i <= killableEnemies; i++) {            
            addObject(new Mouse(), Greenfoot.getRandomNumber(750) + 25, 400);
        }
    }
    
}