import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class describes the second Level. The Garden!
 * 
 * This level should lead to the third one - The sewers.
 */
public class Garden extends CatWorld {    

    public Garden() {
        this.prepare();
    }

    private void prepare() {
        //Spawn Objects in World
        addObject(new CatHero(),667,506);

        //enemies
        addObject(new Mouse(),703,499);
        addObject(new Rat(),979,325);
    }
}
