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
        killableEnemies = 8;
        addObject(new CatHero(), 200, 200);
        spawnEnemy();
    }
    
    public void act() {
        checkForNextWorld(this);
    }
    
    public void spawnEnemy() {
        for (int i = 1; i <= killableEnemies; i++) {            
            addObject(new Mouse(), Greenfoot.getRandomNumber(1550) + 25, 850);
        }
    }
}
