import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GuianaSpaceCenter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class GuianaSpaceCenter extends CatWorld {

    public GuianaSpaceCenter() {
        //this.prepare();
    }
    
    private void prepare() {
        //Spawn Objects in World
        addObject(new CatHero(),667,506);

        //enemies
        addObject(new Mouse(),703,499);
        addObject(new Rat(),979,325);
    }
}
