import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CatWorld extends World {

    public CatWorld(){    

        super(1600, 900, 1); 
        prepare();
    }
    private void prepare()
    {
        CatHero catHero = new CatHero();
        addObject(catHero,656,498);
        Mouse mouse = new Mouse();
        addObject(mouse,1001,426);
        mouse.setLocation(703,499);
    }
}
