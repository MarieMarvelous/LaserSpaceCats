import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Garden here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Garden extends CatWorld {    
    
    public Garden(){
        
    }
    
    private void prepare() {
        CatHero catHero = new CatHero();
        //addObject(catHero,656,498);
        Mouse mouse = new Mouse();
        //Greenfoot.getWorld().addObject(mouse,1001,426);
        mouse.setLocation(703,499);
        catHero.setLocation(519,505);
        catHero.setLocation(667,506);
        Rat rat = new Rat();
        //Greenfoot.getWorld().addObject(rat,979,325);
    }
}
