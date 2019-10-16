import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Garden here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Garden extends CatWorld {    


    public Garden() {
        super();
        //Spawn Objects in World
        addObject(new CatHero(),400,225);
        killableEnemies = 4;
        //super.spawnedEnemy();

        //enemies
        //addObject(new Mouse(),703,499);
        //addObject(new Rat(),979,325);
    }

    public void act() {
        Greenfoot.delay(250);
        //WorldController.switchToNextWorld(this);
        checkForNextWorld(this);
    }
}
